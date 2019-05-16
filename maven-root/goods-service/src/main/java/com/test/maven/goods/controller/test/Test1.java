package com.test.maven.goods.controller.test;

import com.test.common.entity.Goods;
import com.test.common.result.CommonResult;
import com.test.maven.goods.lock.DistributedLockHandler;
import com.test.maven.goods.lock.RedisDistributionLock;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;


@Api(value = "测试相关")
@RestController
@RequestMapping("test")
public class Test1 {

    public static void main(String[] args) {
        FanXing fx = new FXImpl<Integer>();
//        fx
    }

    @Autowired
    RedisDistributionLock redisDistributionLock;
    @Autowired
    DistributedLockHandler distributedLockHandler;

    @Autowired
    RedisTemplate redisTemplate;

    @ApiOperation("测试redis")
    @GetMapping("/t1/redis")
    public CommonResult<Object> test(){
        redisTemplate.opsForValue().set("test00001","0000",30, TimeUnit.SECONDS);
        return CommonResult.getSucceedInstance();
    }
}
