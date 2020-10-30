package com.test.maven.goods.server.designpatterns.命令模式;

import java.util.ArrayList;
import java.util.List;

/**
 *  @Copyright (C) 四川千行你我科技有限公司
 *  @Author: Longyao
 *  @Date: 2020/3/25 17:52
 *  @Description:
 */
public class HongCommandImpl implements HongCommand {

    public List<Command> commands = new ArrayList<>();

    @Override
    public void add(Command command) {
        commands.add(command);
    }

    @Override
    public void remove(Command command) {
        commands.remove(command);
    }

    @Override
    public void execute() {
        for (Command command : commands) {
            command.execute();
        }
    }
}
