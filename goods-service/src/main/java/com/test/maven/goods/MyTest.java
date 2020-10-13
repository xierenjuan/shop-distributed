package com.test.maven.goods;

import com.github.pagehelper.PageHelper;

public class MyTest {

    public static void main(String[] args) {
//        ReentrantLock lock = new ReentrantLock(true);
//        lock.lock();
//        ExecutorService threadPool = Executors.newFixedThreadPool(10);
//        while(true) {
//            threadPool.execute(new Runnable() { // 提交多个线程任务，并执行
//                @Override
//                public void run() {
//                    System.out.println(Thread.currentThread().getName() + " is running ..");
//                    try {
//                        Thread.sleep(3000);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
//                }
//            });
//        }

        PersonT builder = PersonT.build().age(1).name("aa").score("ccc").builder();
        PageHelper.startPage(1, 20);

    }
}
