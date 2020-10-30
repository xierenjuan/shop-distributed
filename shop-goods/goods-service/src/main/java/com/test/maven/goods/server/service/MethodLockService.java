package com.test.maven.goods.server.service;

import com.test.common.entity.MethodLock;

public interface MethodLockService {


    void add(MethodLock methodLock);

    MethodLock getByMethod(String method);

}
