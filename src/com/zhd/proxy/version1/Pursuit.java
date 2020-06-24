package com.zhd.proxy.version1;

/**
 *
 * 追求者
 * @author zhanghda
 * @version 1.0
 */
public class Pursuit implements Person {

    private String name;

    public Pursuit(String name){
        this.name = name;
    }


    @Override
    public void sendFlower() {
        System.out.println(name+"送花");
    }

    @Override
    public void sendWater() {
        System.out.println(name+"送水");

    }

    @Override
    public void sendBook() {
        System.out.println(name+"送书");

    }
}
