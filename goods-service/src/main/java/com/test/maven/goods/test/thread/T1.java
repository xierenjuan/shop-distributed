package com.test.maven.goods.test.thread;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class T1 {

    static Map<String, String> map = new HashMap<>();
    public static class AddThread implements Runnable{

        int start = 0;
        public AddThread(int start){
            this.start = start;
        }
        @Override
        public void run() {
            for (int i = start; i < 100000 ; i+=2) {
                map.put(Integer.toString(i),Integer.toBinaryString(i));
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
//        Thread t1 = new Thread(new T1.AddThread(0));
//        Thread t2 = new Thread(new T1.AddThread(1));
//        t1.start();t2.start();
//        t1.join();t2.join();
//        System.out.println(map.size());

//        System.out.println("sss".hashCode());
//        int i = new T1().hashCode();
//        System.out.println(i);
//        T1 t1 = new T1();
//        T1 t2 = new T1();
//        System.out.println(t1.hashCode());
//        System.out.println(t2.hashCode());
//        System.out.println(t1.equals(t2));

//        Map<String,String> map = new HashMap<>();
//        map.put("a","a");
//        map.put("a","a");
//        map.get("a");
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
//
//        System.out.println(Runtime.getRuntime().availableProcessors());
//        System.out.println(hash("sss"));

//        int i;
//        i = (16 - 1) & 114194;
//        System.out.println(i);


        Map<Integer, Integer> m1 = new HashMap<>();
        for (int i = 0; i < 5000000; i++) {
            m1.put(i,i);
        }
        long L1 = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry : m1.entrySet()) {
//            System.out.println(entry.getValue());
        }
        System.out.println("时间差：" + (System.currentTimeMillis() - L1));

        Map<Integer, Integer> m2 = new ConcurrentSkipListMap<>();
        for (int i = 0; i < 5000000; i++) {
            m2.put(i,i);
        }
        long L2 = System.currentTimeMillis();
        for (Map.Entry<Integer, Integer> entry : m2.entrySet()) {
//            System.out.println(entry.getValue());
        }
        System.out.println("时间差：" + (System.currentTimeMillis() - L2));

        ConcurrentHashMap<Object, Object> objectObjectConcurrentHashMap = new ConcurrentHashMap<>();
//        objectObjectConcurrentHashMap.put();
//        objectObjectConcurrentHashMap.size()
//        objectObjectConcurrentHashMap.get();

        ThreadLocal<SimpleDateFormat> t = new ThreadLocal<>();
    }

    public static int hash(Object key) {
        int h;
        return (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
