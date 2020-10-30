package com.test.maven.goods.server.designpatterns.命令模式;

/**
 *  @Copyright (C) 四川千行你我科技有限公司
 *  @Author: Longyao
 *  @Date: 2020/3/24 17:00
 *  @Description:
 */
public class Invoker {

    //拥有命令对象
    private Command command;

    public Invoker(Command command){
        this.command = command;
    }

    public void action(){
        // 执行命令
        command.execute();
    }
}
