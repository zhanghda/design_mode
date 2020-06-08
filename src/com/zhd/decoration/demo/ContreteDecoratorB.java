package com.zhd.decoration.demo;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ContreteDecoratorB extends Decorator {

    @Override
    public void operation() {
        super.operation();
        addBehavior();
    }
    public void addBehavior(){
        System.out.println("b 独有的装饰");
    }
}
