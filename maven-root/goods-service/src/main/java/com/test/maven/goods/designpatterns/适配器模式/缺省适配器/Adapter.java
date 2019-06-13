package com.test.maven.goods.designpatterns.适配器模式.缺省适配器;


public class Adapter extends ServiceAdapter {
    @Override
    public void serviceOperation1() {
        System.out.println("具体事项");
    }

    @Override
    public int serviceOperation2() {
        return 0;
    }
}
