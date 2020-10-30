package com.test.maven.goods.server.designpatterns.命令模式;

/**
 *  @Copyright (C) 四川千行你我科技有限公司
 *  @Author: Longyao
 *  @Date: 2020/3/24 17:27
 *  @Description:
 */
public class ChuShiReceiver extends Receiver {

    @Override
    public void action() {
        System.out.println("厨师做菜");
    }
}
