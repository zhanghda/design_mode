package com.zhd.decoration.version3;

/**
 * @author zhanghda
 * @version 1.0
 */
public class Decorator extends ConcreteComponent{

    private ConcreteComponent concreteComponent;

    public void setConcreteComponent(ConcreteComponent concreteComponent){
        this.concreteComponent = concreteComponent;
    }


    @Override
    public void operation() {
        concreteComponent.operation();
    }
}
