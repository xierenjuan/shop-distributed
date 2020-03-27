package com.test.maven.goods.designpatterns.命令模式;

/**
 *  @Copyright (C) 四川千行你我科技有限公司
 *  @Author: Longyao
 *  @Date: 2020/3/24 16:36
 *  @Description:
 */
public class Client {

    public static void main(String[] args) {

//        Receiver receiver = new ChuShiReceiver();
//        Command command = new CommandImpl(receiver);
//        Invoker invoker = new Invoker(command);
//        invoker.action();

        // 宏命令
        Receiver chuShiReceiver = new ChuShiReceiver();
        Receiver soldierReceiver = new SoldierReceiver();
        Command command1 = new CommandImpl(chuShiReceiver);
        Command command2 = new CommandImpl(soldierReceiver);

        HongCommand hongCommand = new HongCommandImpl();
        hongCommand.add(command1);
        hongCommand.add(command2);

        hongCommand.execute();

    }
}
