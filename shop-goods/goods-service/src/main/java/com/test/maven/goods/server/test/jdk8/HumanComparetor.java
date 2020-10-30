package com.test.maven.goods.server.test.jdk8;

import com.alibaba.fastjson.JSONObject;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class HumanComparetor implements Comparator<Human> {
    @Override
    public int compare(Human h1, Human h2) {
        if (h1.getAge() > h2.getAge()) {
            return -1;
        } else if (h1.getAge() == h2.getAge()) {
            return 0;
        } else {
            return 1;
        }
    }

    public static void main(String[] args) {
        List<String> strs = new ArrayList<>();
        strs.add("eeddd");
        strs.add("222");
        strs.add("333");
        strs.add("444");

//        List<String> collect = strs.stream().map(String::toUpperCase).collect(Collectors.toList());
        List<String> collect = strs.stream().map(name -> {name = name + "vvvv";return name.toUpperCase();}).collect(Collectors.toList());
        System.out.println(JSONObject.toJSONString(collect));
    }
}