package com.test.maven.user.server.controller;

import com.test.common.result.CommonResult;
import com.test.maven.user.server.dao.UserMapper;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("用户相关")
@RestController
@RequestMapping("user")
@RefreshScope
public class UserController {

    @Value("${test.name}")
    private String name;
    @Autowired
    private UserMapper userMapper;

    @ApiOperation("测试获取配置文件的值")
    @GetMapping("test2")
    public CommonResult<Object> test2(){
        return CommonResult.getSucceedInstance(userMapper.selectByPrimaryKey(1L));
    }
}
