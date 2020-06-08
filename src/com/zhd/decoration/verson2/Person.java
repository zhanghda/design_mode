package com.zhd.decoration.verson2;

/**
 * @author zhanghda
 * @version 1.0
 */
public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void shwow(){
        System.out.println("爱打扮的"+name);
    }
}
