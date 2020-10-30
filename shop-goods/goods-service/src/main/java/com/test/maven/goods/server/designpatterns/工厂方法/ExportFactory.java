package com.test.maven.goods.server.designpatterns.工厂方法;

public interface ExportFactory {
    ExportFile factory(String type);
}