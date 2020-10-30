package com.test.maven.goods.server.designpatterns.命令模式;

/**
 *  @Copyright (C) 四川千行你我科技有限公司
 *  @Author: Longyao
 *  @Date: 2020/3/24 16:52
 *  @Description:
 */
public class CommandImpl implements Command{

    //拥有接受者
    private Receiver receiver;

    public CommandImpl(Receiver receiver){
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        // 真正让接受者去执行
        receiver.action();
    }
}
