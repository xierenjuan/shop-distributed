package com.test.maven.goods.server.designpatterns.抽象工厂模式.简单工厂模式.test;

import com.test.maven.goods.server.designpatterns.抽象工厂模式.简单工厂模式.Cpu;
import com.test.maven.goods.server.designpatterns.抽象工厂模式.简单工厂模式.CpuFactory;
import com.test.maven.goods.server.designpatterns.抽象工厂模式.简单工厂模式.Mainboard;
import com.test.maven.goods.server.designpatterns.抽象工厂模式.简单工厂模式.MainboardFactory;

public class TestFactory {
    public static void main(String[] args) {
        Cpu cpu = CpuFactory.createCpu(1);
        Mainboard mainboard = MainboardFactory.createMainboard(2);
        cpu.calculate();
        mainboard.installCPU();
    }
}
