package com.test.maven.message.server.controller;

import com.test.common.result.CommonResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("message")
@Api(value = "消息Api")
public class MessageController {

    @ApiOperation("test")
    @GetMapping("test")
    public CommonResult test(){

        return CommonResult.getSucceedInstance("ok");
    }

}
