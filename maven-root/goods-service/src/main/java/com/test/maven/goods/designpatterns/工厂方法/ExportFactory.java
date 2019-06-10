package com.test.maven.goods.designpatterns.工厂方法;

public interface ExportFactory {
    ExportFile factory(String type);
}