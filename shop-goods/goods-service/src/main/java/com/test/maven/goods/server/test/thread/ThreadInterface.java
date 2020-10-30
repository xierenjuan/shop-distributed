package com.test.maven.goods.server.test.thread;

/**
 * 实现runnable接口
 */
public class ThreadInterface implements Runnable {

    @Override
    public void run() {
        for (int i=0; i<10;i++){
            System.out.println(Thread.currentThread().getName() + "=======================");
        }
    }
}
