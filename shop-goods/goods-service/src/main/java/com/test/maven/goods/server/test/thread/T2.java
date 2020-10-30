package com.test.maven.goods.server.test.thread;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T2 {

    public static void main(String[] args) {

        ConcurrentHashMap<String, String> map = new ConcurrentHashMap<String, String>();
        map.put("a", "a");
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        executorService.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println("执行");
            }
        });
    }
}
