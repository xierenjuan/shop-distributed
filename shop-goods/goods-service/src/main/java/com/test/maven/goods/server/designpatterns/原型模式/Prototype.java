package com.test.maven.goods.server.designpatterns.原型模式;

public interface Prototype{
    /**
     * 克隆自身的方法
     * @return 一个从自身克隆出来的对象
     */
    public Object clone();
}