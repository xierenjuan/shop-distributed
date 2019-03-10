package com.test.maven.goods.controller;

import com.alibaba.fastjson.JSONObject;
import com.test.common.entity.Goods;
import com.test.common.result.CommonResult;
import com.test.maven.goods.properties.TestGoods;
import com.test.maven.goods.service.GoodsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Api(value = "商品相关")
@RestController
@RequestMapping("goods")
public class GoodsController {

    @Autowired
    private GoodsService goodsService;
    @Autowired
    private TestGoods testGoods;

    @ApiOperation("商品测试")
    @GetMapping("/test")
    public CommonResult<Object> test(){
        Goods goods = new Goods();
        goods.setId(1L);
        goods.setName("test");
        goods.setPutaway(true);
//        goodsService.insert(goods);
        return CommonResult.getSucceedInstance(goodsService.list());
    }

    @ApiOperation("导入")
    @PostMapping("/poi")
    public CommonResult<Object> test(MultipartFile file) throws Exception {
        Integer integer = new GoodsController().batchImport(file.getOriginalFilename(), file);
        return CommonResult.getSucceedInstance();
    }


    public Integer batchImport(String fileName, MultipartFile file) throws Exception {
        boolean notNull = false;
        Integer status = 1;
//        List<ResultInfo> resultList = new ArrayList<>();

        if (!fileName.matches("^.+\\.(?i)(xls)$") && !fileName.matches("^.+\\.(?i)(xlsx)$")) {
            String error = "上传文件格式不正确";
            status = 0;
            return status;
        }
        boolean isExcel2003 = true;
        if (fileName.matches("^.+\\.(?i)(xlsx)$")) {
            isExcel2003 = false;
        }
        InputStream is = file.getInputStream();
        Workbook wb = null;
        if (isExcel2003) {
            wb = new HSSFWorkbook(is);
        } else {
            wb = new XSSFWorkbook(is);
        }
        Sheet sheet = wb.getSheetAt(0);
        if (sheet != null) {
            notNull = true;
        }

        List<Map<String, String>> map = new ArrayList<>();
        for (int r = 3; r < sheet.getLastRowNum() - 1; r++) {
            Row row = sheet.getRow(r);
            double value0 = row.getCell(1).getNumericCellValue();
            String value1 = row.getCell(2).getStringCellValue();
            double value2 = row.getCell(3).getNumericCellValue();
            String value3 = row.getCell(4).getStringCellValue();
            double value4 = row.getCell(5).getNumericCellValue();
            String value5 = row.getCell(6).getStringCellValue();
            System.out.println(value0 + "," + value1 + "," + value2 + ", " + value3 + "," + value4 + "," + value5);

            HashMap<String, String> inMap = new HashMap<>();

        }
        return status;
    }
}
