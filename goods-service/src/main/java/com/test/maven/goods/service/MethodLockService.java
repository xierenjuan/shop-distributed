package com.test.maven.goods.service;

import com.test.common.entity.MethodLock;

public interface MethodLockService {


    void add(MethodLock methodLock);

    MethodLock getByMethod(String method);

}
