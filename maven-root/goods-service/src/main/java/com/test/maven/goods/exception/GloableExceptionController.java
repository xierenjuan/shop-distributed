package com.test.maven.goods.exception;

import com.test.common.result.CommonResult;
import com.test.maven.goods.exception.custom.DataException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GloableExceptionController {

    private final static Logger logger = LoggerFactory.getLogger(GloableExceptionController.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public CommonResult<Void> handle(Exception e) {
        e.printStackTrace();
        if (e instanceof DataException) {
            return CommonResult.getFaiInstance("3001",e.getMessage());
        }else {
            return CommonResult.getFaiInstance("6001",e.getMessage());
        }
    }

}
