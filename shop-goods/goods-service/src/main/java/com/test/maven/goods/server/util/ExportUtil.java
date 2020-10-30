package com.test.maven.goods.server.util;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.net.URLEncoder;
import java.text.SimpleDateFormat;
import java.util.*;

public class ExportUtil {

    /**
     *
     * @param fileName
     * @param sheetNames 多个sheet
     * @param titles 多个sheet 对应的多个titles
     * @param datas 多个sheet的数据
     * @param response 下载的话，返回流
     */
    public static void export(String fileName, String[] sheetNames, List<String[]> titles,List<List<?>> datas,HttpServletResponse response){
        if(fileName == null || fileName.trim().length() == 0 || sheetNames == null
                || sheetNames.length == 0 || titles == null || titles.size() == 0 || datas == null | datas.size() == 0)
            throw new RuntimeException("the param is not null");

        int sheetLength = sheetNames.length;
        int titleLength = titles.size();
        int dataLength = datas.size();
        if(!(sheetLength == titleLength && titleLength == dataLength))
            throw new RuntimeException("the sheetNames number must equal the titles number and the datas number ");

        HSSFWorkbook wb = new HSSFWorkbook();
        try {
            for (int sheet = 0;sheet < sheetLength; sheet ++){
                HSSFSheet hssfSheet = wb.createSheet(sheetNames[sheet]);
                String[] currentTitles = titles.get(sheet);
                HSSFRow row0 = hssfSheet.createRow(0);
                for (int title = 0; title < currentTitles.length; title++){
                    HSSFCell cell = row0.createCell(title);
                    cell.setCellValue(currentTitles[title]);
                    cell.setCellStyle(getDefaultCellStyle(wb));
                }
                //开始写入数据
                int rowNum = 1;
                List<?> data = datas.get(sheet);
                for (Object da : data) {
                    Class daC = da.getClass();
                    //所有字段
                    Field[] fields = daC.getDeclaredFields();

                    Class superclass = daC.getSuperclass();
                    Field[] declaredFields = null;
                    if(!superclass.getSimpleName().equals("Object")){
                        declaredFields = superclass.getDeclaredFields();
                    }
                    if(declaredFields != null){
                        int lenth1 = fields.length;
                        int lenth2 = declaredFields.length;
                        fields = Arrays.copyOf(fields, lenth1+ lenth2);
                        System.arraycopy(declaredFields, 0, fields, lenth1 , lenth2);
                    }

                    List<String> rowFileds = new ArrayList<>();
                    for (Field field : fields) {
                        field.setAccessible(true);
                        ExportSortAnnotation annotation = field.getAnnotation(ExportSortAnnotation.class);
                        if(annotation == null)
                            continue;

                        int sort = annotation.sort();
                        String value = "";
                        Object o = field.get(da);
                        if(o != null){
                            if(o instanceof Date){
                                Date d = (Date) o;
                                value = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA).format(d);
                            } else {
                                value = o.toString();
                            }
                        }
                        rowFileds.add(sort + "," + value);
                    }
                    Collections.sort(rowFileds);

                    HSSFRow row = hssfSheet.createRow(rowNum);
                    for (int rowFiled = 0; rowFiled < rowFileds.size(); rowFiled++) {
                        row.createCell(rowFiled).setCellValue(rowFileds.get(rowFiled).split(",")[1]);
                    }
                    rowNum++;
                }
            }
//            buildExcelToProject(fileName,wb);
            downloadExcel(fileName,wb,response);
        } catch (Exception e){
            e.printStackTrace();
        }


    }
    //创建表头
    public static void createTitle(HSSFWorkbook workbook, HSSFSheet sheet, String[] titles){
        HSSFRow row = sheet.createRow(0);
        for (int i = 0; i<titles.length ; i++) {
            HSSFCell cell = row.createCell(i);
            cell.setCellValue(titles[i]);
        }
    }

    //生成excel文件到本地
    public static void buildExcelToProject(String filename, HSSFWorkbook workbook) throws Exception{
//        FileOutputStream fos = new FileOutputStream(filename);
//        workbook.write(fos);
//        fos.flush();
//        fos.close();
    }

    //浏览器下载excel
    public static void downloadExcel(String filename, HSSFWorkbook workbook, HttpServletResponse response) throws Exception{
        response.setContentType("application/vnd.ms-excel");
        response.setHeader("Content-Disposition", "attachment;filename="+ URLEncoder.encode(filename, "utf-8"));
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        outputStream.flush();
        outputStream.close();
    }


    public static void main(String[] args) {
        String fileName = "测试文件";
        String[] sheetNames = {"sheet1"};
        String[] title = {"长度","名称","金额","生日"};
        List<String[]> titles = new ArrayList<>(); titles.add(title);
        List<List<?>> datas = new ArrayList<>();
        List<ExportEntity1> data = new ArrayList<>();datas.add(data);
        data.add(new ExportEntity1("名称", BigDecimal.ZERO,new Date(),1));

//        export(fileName,sheetNames,titles,datas);
    }


    /**
     * 水平居中、垂直居中
     * 字体：宋体
     * 字体大小：16号
     * 加粗
     * @param workbook
     * @return
     */
    public static CellStyle getStyle(HSSFWorkbook workbook) {
        CellStyle cellstyle=workbook.createCellStyle();
        cellstyle.setAlignment(HorizontalAlignment.CENTER);//水平居中
        cellstyle.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        Font font=workbook.createFont();//字体
        font.setFontName("宋体");//字体
        font.setFontHeightInPoints((short)16);//字号
        font.setBold(true);//加粗
        cellstyle.setFont(font);
        setBorderStyle(cellstyle);
        return cellstyle;
    }

    /**
     * 获取默认的cell表格样式，加边框，水平居中，垂直居中
     * @param workbook
     * @return
     */
    public static CellStyle getDefaultCellStyle(HSSFWorkbook workbook) {
        CellStyle style=workbook.createCellStyle();
        style.setAlignment(HorizontalAlignment.CENTER);//水平居中
        style.setVerticalAlignment(VerticalAlignment.CENTER);//垂直居中
        setBorderStyle(style);
        return style;
    }

    /**
     * 边框样式
     * @param style
     */
    public static void setBorderStyle(CellStyle style) {
        style.setBorderBottom(BorderStyle.THIN); //下边框
        style.setBorderLeft(BorderStyle.THIN);//左边框
        style.setBorderTop(BorderStyle.THIN);//上边框
        style.setBorderRight(BorderStyle.THIN);//右边框
    }

    /**
     * 奇数行
     * 背景颜色为黄色
     * @param style
     */
    public static void setCellStyleYellow(CellStyle style) {
        style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    }
    /**
     * 偶数行
     * 背景颜色为LIME
     * @param style
     */
    public static void setCellStyleLime(CellStyle style) {
        style.setFillForegroundColor(IndexedColors.LIME.getIndex());
        style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
    }
    /**
     * 字体设置红色
     * @param workbook
     * @param style
     */
    public static void setFontRedColor(HSSFWorkbook workbook,CellStyle style) {
        Font font=workbook.createFont();//字体
        font.setColor(IndexedColors.RED.getIndex());
        style.setFont(font);
    }
}
