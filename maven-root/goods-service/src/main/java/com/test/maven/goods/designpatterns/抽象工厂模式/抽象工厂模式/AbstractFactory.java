package com.test.maven.goods.designpatterns.抽象工厂模式.抽象工厂模式;

public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return CPU对象
     */
    Cpu createCpu();
    /**
     * 创建主板对象
     * @return 主板对象
     */
    Mainboard createMainboard();
}