package com.test.maven.goods.controller.test;

import com.alibaba.fastjson.JSONObject;
import com.test.common.entity.Enterprise;
import com.test.common.entity.Goods;
import com.test.common.result.CommonResult;
import com.test.maven.goods.lock.DistributedLockHandler;
import com.test.maven.goods.lock.RedisDistributionLock;
import com.test.maven.goods.repositorydao.EnterpriseRespository;
import com.test.maven.goods.repositoryentity.EnterpriseElastic;
import com.test.maven.goods.service.EnterpriseService;
import com.test.maven.goods.util.BeanUtils;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
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

    @Autowired
    EnterpriseService enterpriseService;
    @Autowired
    EnterpriseRespository enterpriseRespository;

    @ApiOperation("测试es")
    @GetMapping("/t1/es")
    public CommonResult<Object> test01(){
        List<Enterprise> list = enterpriseService.list(null);
        List<EnterpriseElastic> enterpriseElastics = BeanUtils.copyToOutList(list, EnterpriseElastic.class);
        enterpriseRespository.saveAll(enterpriseElastics);
        Iterable<EnterpriseElastic> all = enterpriseRespository.findAll();
        for (EnterpriseElastic enterpriseElastic : all) {
            System.out.println(JSONObject.toJSONString(enterpriseElastic));
        }
        return CommonResult.getSucceedInstance();
    }

    @ApiOperation("查询es")
    @GetMapping("/search/es")
    public CommonResult<Object> search(){
        Iterable<EnterpriseElastic> all = enterpriseRespository.findAll();
        List<EnterpriseElastic> list = new ArrayList<>();
        for (EnterpriseElastic enterpriseElastic : all) {
            list.add(enterpriseElastic);
        }

        return CommonResult.getSucceedInstance(list);
    }
}
