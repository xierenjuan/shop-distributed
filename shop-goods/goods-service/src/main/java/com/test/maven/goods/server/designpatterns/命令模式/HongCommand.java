package com.test.maven.goods.server.designpatterns.命令模式;

/**
 *  @Copyright (C) 四川千行你我科技有限公司
 *  @Author: Longyao
 *  @Date: 2020/3/25 17:50
 *  @Description:
 */
public interface HongCommand extends Command {

    void add(Command command);

    void remove(Command command);
}
