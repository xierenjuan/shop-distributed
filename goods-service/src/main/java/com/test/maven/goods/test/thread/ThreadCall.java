package com.test.maven.goods.test.thread;

import java.util.concurrent.Callable;

public class ThreadCall implements Callable<Integer> {


    @Override
    public Integer call() {
        int sum = 0;
        for (int i = 0; i< 10; i++){
            sum+=i;
            System.out.println(Thread.currentThread().getName() + ",00000000" );
        }
        return sum;
    }
}
