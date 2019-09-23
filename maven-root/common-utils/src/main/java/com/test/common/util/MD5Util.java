package com.test.common.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Map;

public class MD5Util {

    public static final Logger logger = LoggerFactory.getLogger(MD5Util.class);

    /**
     * 获取待签名的字符串
     * @param map  对象参数
     * @param key  appkey
     * @return
     */
    public static String getStringWaitSign(Map<String,Object> map, String key){
        String sortStr = MapUtil.mapToSortString(map);
        sortStr += "appKey=" + key;
        return sortStr;
    }
    private static String byteToHexString(byte b) {
        int n = b;
        if (n < 0)
            n += 256;
        int d1 = n / 16;
        int d2 = n % 16;
        return hexDigits[d1] + hexDigits[d2];
    }

    /**
     *  生成签名
     * @param originStr  原串
     * @param charsetname 编码格式
     * @return
     */
    public static String md5(String originStr, String charsetname) {
        String resultString = null;
        try {
            resultString = new String(originStr);
            MessageDigest md = MessageDigest.getInstance("MD5");
            if (charsetname == null || "".equals(charsetname))
                resultString = byteArrayToHexString(md.digest(resultString
                        .getBytes()));
            else
                resultString = byteArrayToHexString(md.digest(resultString.getBytes(charsetname)));
        } catch (Exception e) {
            logger.error(" create sign is fail ：" + e.getMessage());
        }
        return resultString.toUpperCase();
    }

    private static String md5(String origin) {
        try {
            // 生成一个MD5加密计算摘要
            MessageDigest md = MessageDigest.getInstance("MD5");
            // 计算md5函数
            md.update(origin.getBytes());
            // digest()最后确定返回md5 hash值，返回值为8为字符串。因为md5 hash值是16位的hex值，实际上就是8位的字符
            // BigInteger函数则将8位的字符串转换成16位hex值，用字符串来表示；得到字符串形式的hash值
            return new BigInteger(1, md.digest()).toString(16);
        } catch (Exception e) {
            logger.error(" create sign is fail ：" + e.getMessage());
        }
        return origin;

    }
    private static final char[] HEX_CHARS = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private static String getMD5(String str) {
        try {
            byte[] btInput = str.getBytes("utf-8");
            MessageDigest mdInst = MessageDigest.getInstance("MD5");
            mdInst.update(btInput);
            byte[] md = mdInst.digest();
            int j = md.length;
            char charArray[] = new char[j * 2];
            int k = 0;
            for (int i = 0; i < j; i++) {
                byte byte0 = md[i];
                charArray[k++] = HEX_CHARS[byte0 >>> 4 & 0xf];
                charArray[k++] = HEX_CHARS[byte0 & 0xf];
            }
            return new String(charArray);
        } catch (Exception e) {
            logger.error(" create sign is fail ：" + e.getMessage());
            return null;
        }
    }

    private static String byteArrayToHexString(byte b[]) {
        StringBuffer resultSb = new StringBuffer();
        for (int i = 0; i < b.length; i++)
            resultSb.append(byteToHexString(b[i]));

        return resultSb.toString();
    }

    private static final String hexDigits[] = {"0", "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "a", "b", "c", "d", "e", "f"};

    public static void main(String[] args) {
        System.out.println(md5("好"));
    }
}
