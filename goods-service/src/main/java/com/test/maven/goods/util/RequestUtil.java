package com.test.maven.goods.util;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;

/**
 * HttpServletRequest 相关
 */
public class RequestUtil {

    /**
     *
     * @return
     */
    public static HttpServletRequest currentRequest(){
        ServletRequestAttributes requestAttributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = requestAttributes.getRequest();
        return request;
    }

}