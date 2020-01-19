package com.test.maven.user.controller;

import com.test.common.dto.GoodsDto;
import com.test.common.entity.User;
import com.test.common.result.CommonResult;
import com.test.maven.api.GoodsApi;
import com.test.maven.user.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("用户相关")
@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private GoodsApi goodsApi;

    @ApiOperation("用户服务测试")
    @GetMapping("test")
    public CommonResult<Object> test(){
        User user = new User();
        user.setId(1L);
        user.setName("test");
//        userService.insert(user);
//        List<User> list = userService.list();
        List<GoodsDto> list = goodsApi.list(1);
        return CommonResult.getSucceedInstance(list);
    }
}
