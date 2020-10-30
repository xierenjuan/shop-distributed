package com.test.maven.goods.server.service.Impl;

import com.test.common.entity.MethodLock;
import com.test.common.entity.MethodLockExample;
import com.test.common.util.SnGeneratorUtil;
import com.test.maven.goods.server.dao.MethodLockMapper;
import com.test.maven.goods.server.service.MethodLockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service
public class MethodLockServiceImpl implements MethodLockService {


    @Autowired
    private MethodLockMapper methodLockMapper;

    @Override
    @Transactional
    public void add(MethodLock methodLock) {
        methodLock.setCreateDate(new Date());
        methodLock.setDesc("desc");
        methodLock.setDr(false);
        methodLock.setMethodName("add");
        methodLock.setTimeOut(111L);
        methodLock.setUpdateDate(new Date());
        methodLock.setId(Integer.valueOf((SnGeneratorUtil.getId()+"").substring(0,6)));
        methodLockMapper.insert(methodLock);

    }

    @Override
    public MethodLock getByMethod(String method) {
        MethodLockExample methodLockExample = new MethodLockExample();
        MethodLockExample.Criteria criteria = methodLockExample.createCriteria();
        criteria.andDrEqualTo(false).andMethodNameEqualTo(method);
        List<MethodLock> methodLocks = methodLockMapper.selectByExample(methodLockExample);
        if(methodLocks.isEmpty())
            return null;
        return methodLocks.get(0);
    }
}
