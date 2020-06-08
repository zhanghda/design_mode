package com.zhd.strategy;

import java.util.HashMap;

public class ContentMain {

    public static void main(String[] args) {
        //单一算法
//        Content content = new Content("满300减50");
//        System.out.println(content.oper(500));

        Content content1 = new Content("打八折+满300减50");
        System.out.println(content1.oper2(3302));


//        new HashMap<>()
    }
}
