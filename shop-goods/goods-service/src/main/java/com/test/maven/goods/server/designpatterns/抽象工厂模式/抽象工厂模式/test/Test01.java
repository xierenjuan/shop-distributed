package com.test.maven.goods.server.designpatterns.抽象工厂模式.抽象工厂模式.test;

import com.test.maven.goods.server.designpatterns.抽象工厂模式.抽象工厂模式.AbstractFactory;
import com.test.maven.goods.server.designpatterns.抽象工厂模式.抽象工厂模式.Cpu;
import com.test.maven.goods.server.designpatterns.抽象工厂模式.抽象工厂模式.IntelFactory;
import com.test.maven.goods.server.designpatterns.抽象工厂模式.抽象工厂模式.Mainboard;

public class Test01 {
    public static void main(String[] args) {
        AbstractFactory intel = new IntelFactory();
        Cpu cpu = intel.createCpu();
        Mainboard mainboard = intel.createMainboard();
        cpu.calculate();
        mainboard.installCPU();
    }
}
