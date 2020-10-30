package com.test.maven.goods.server.designpatterns.桥接模式;

public class RefinedAbstraction extends Abstraction {
    
    public RefinedAbstraction(Implementor impl) {
        super(impl);
    }
    //其他的操作方法
    public void otherOperation(){
        
    }
}