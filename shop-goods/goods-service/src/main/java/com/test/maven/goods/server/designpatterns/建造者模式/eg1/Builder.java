package com.test.maven.goods.server.designpatterns.建造者模式.eg1;

public interface Builder {
    void buildPart1();
    void buildPart2();
    Product retrieveResult();
}