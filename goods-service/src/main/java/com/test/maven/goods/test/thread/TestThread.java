package com.test.maven.goods.test.thread;

import io.swagger.models.auth.In;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class TestThread {

    public static void main(String[] args) throws InterruptedException {

//      1、继承
//        for (int i = 0; i < 10;i++){
//            Thread threadDemo2 = new ThreadDemo();
//            threadDemo2.setName("线程：" + i);
//            threadDemo2.start();
//        }

//       2、实现runnable接口
//         for (int i = 0; i < 10;i++){
//             第一种写法
//             Thread t = new Thread(new ThreadInterface());
//             t.setName("线程：" + i );
//             t.start();

//           第二种写法
//             Thread t = new Thread(new Runnable() {
//                 @Override
//                 public void run() {
//
//                 }
//             });
//             int i2=i;
////           第三种写法
//             Thread t = new Thread(() -> {
//                 System.out.println(Thread.currentThread().getName() + i2 + "----");
//             });
//             t.setName("线程");
//             t.start();
//        }

//        for (int i =0;i<10;i++){
//            Callable<Integer> call = new ThreadCall();
//            FutureTask<Integer> futureTask = new FutureTask<>(call);
//            Thread t = new Thread(futureTask);
//            t.setName("线程：" + i);
//            t.start();
//        }
//        Callable<Integer> call = new ThreadCall();
//        FutureTask<Integer> futureTask = new FutureTask<>(call);
//        for (int i = 0; i < 100; i++) {
//            System.out.println(Thread.currentThread().getName() + " " + i);
//            if (i == 30) {
//                Thread thread = new Thread(futureTask);   //FutureTask对象作为Thread对象的target创建新的线程
//                thread.start();                      //线程进入到就绪状态
//            }
//        }
//        System.out.println("主线程for循环执行完毕..");
//
//        try {
//            int sum = futureTask.get();            //取得新创建的新线程中的call()方法返回的结果
//            System.out.println("sum = " + sum);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        } catch (ExecutionException e) {
//            e.printStackTrace();
//        }



         Thread t = new Thread(new Runnable() {
             @Override
             public void run() {
                while (true){
                    if(Thread.currentThread().isInterrupted()){
                        break;
                    }
                    Thread.yield();
                }
             }
         });
         t.setName("t");
         t.start();

         Thread.sleep(10000);
        System.out.println("==========" + Thread.currentThread().getName());
         t.interrupt();
        System.out.println(Thread.currentThread().getName());
    }
}
