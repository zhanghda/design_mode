package com.zhd.decoration.version3;

/**
 *
 * @author zhanghda
 * @version 1.0
 */
public class ConcreteComponent {

    private String name;

    public ConcreteComponent(){}

    public ConcreteComponent(String name) {
        this.name = name;
    }

    public void operation(){
        System.out.println("爱打扮的"+ name);
    };
}
