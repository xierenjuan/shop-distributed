package com.test.maven.goods.test.thread;

/**
 * 1、继承thread类
 */
public class ThreadDemo extends Thread {

    @Override
    public void run() {
        System.out.println(this.getName()+"=========================");
    }
}
