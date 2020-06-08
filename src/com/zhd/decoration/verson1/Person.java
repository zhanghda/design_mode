package com.zhd.decoration.verson1;

/**
 * @author zhanghda
 * @version 1.0
 */
public class Person {

    private String name;

    public Person(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 穿衣服
     */
    public void wearClothes(){
        System.out.println("穿衣服");
    }
    /**
     * 穿裤子
     */
    public void wearTrousers(){
        System.out.println("穿鞋子");
    }

    public void show(){
        System.out.println("爱打扮的" + this.name);
    }
}
