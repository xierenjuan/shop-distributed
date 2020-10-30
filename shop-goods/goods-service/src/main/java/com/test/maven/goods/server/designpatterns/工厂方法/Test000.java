package com.test.maven.goods.server.designpatterns.工厂方法;

public class Test000 {
    public static void main(String[] args) {
        String data = "";
        ExportFactory exportFactory = new ExportHtmlFactory();
        ExportFile ef = exportFactory.factory("financial");
        ef.export(data);
    }
}
