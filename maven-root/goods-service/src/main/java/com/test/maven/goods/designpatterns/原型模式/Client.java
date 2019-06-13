package com.test.maven.goods.designpatterns.原型模式;

import com.hs.commons.utils.HttpUtils;

public class Client {
    /**
     * 持有需要使用的原型接口对象
     */
    private Prototype prototype;
    /**
     * 构造方法，传入需要使用的原型接口对象
     */
    public Client(Prototype prototype){
        this.prototype = prototype;
    }
    public void operation(Prototype example){
        //需要创建原型接口的对象
        Prototype copyPrototype = (Prototype) prototype.clone();
        
    }

    public static void main(String[] args) {
        Thread t = new Thread(() -> {
            for (int i = 0; i < 100; i++){
                String s = HttpUtils.get("https://kyfw.12306.cn/otn/leftTicket/query?leftTicketDTO.train_date=2019-06-12&leftTicketDTO.from_station=CDW&leftTicketDTO.to_station=SZQ&purpose_codes=ADULT", null);
                System.out.println(s);

            }
        });
        t.start();
        System.out.println("执行中");
    }
}