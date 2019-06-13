package com.test.maven.goods.designpatterns.适配器模式.缺省适配器;

public abstract class ServiceAdapter implements AbstractService{

    @Override
    public void serviceOperation1() {
    }

    @Override
    public int serviceOperation2() {
        return 0;
    }

    @Override
    public String serviceOperation3() {
        return null;
    }

}