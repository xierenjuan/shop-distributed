package com.test.maven.goods.server.designpatterns.建造者模式.eg2;

public class GoodbyeBuilder extends Builder {

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }
    @Override
    public void buildBody() {
        // TODO Auto-generated method stub
        msg.setBody("欢送内容");
    }

    @Override
    public void buildSubject() {
        // TODO Auto-generated method stub
    msg.setSubject("欢送标题");
    }

}