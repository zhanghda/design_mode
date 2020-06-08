package com.zhd.decoration.demo;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ContreteDecoratorA extends Decorator {

    private String addedState;

    @Override
    public void operation() {
        super.operation();
        addedState = "new state";
        System.out.println("A进行装饰" + addedState);
    }
}
