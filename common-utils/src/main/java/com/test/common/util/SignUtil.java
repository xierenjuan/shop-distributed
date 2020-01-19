package com.test.common.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SignUtil {
    public static final Logger logger = LoggerFactory.getLogger(SignUtil.class);

    /**
     * 验证签名
     * @param sign 签名
     * @param originStr  原串
     * @return
     */
    public static boolean checkSign(String sign, String originStr) {

        if (sign == null || originStr == null) {
            logger.error("签名失败，sign=" + sign + ",str=" + originStr);
            return false;
        }
        String md5Up = MD5Util.md5(originStr, "utf-8");
        if (!sign.equals(md5Up)) {
            logger.error("签名失败，sign=" + sign + ", str=" + originStr + ", md5=" + md5Up);
            return false;
        }
        return true;
    }

}
