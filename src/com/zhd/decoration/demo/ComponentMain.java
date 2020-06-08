package com.zhd.decoration.demo;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ComponentMain {
    public static void main(String[] args) {
        ConcreteComponent concreteComponent = new ConcreteComponent();
        ContreteDecoratorA contreteDecoratorA = new ContreteDecoratorA();
        ContreteDecoratorB contreteDecoratorB = new ContreteDecoratorB();

        contreteDecoratorA.SetComponent(concreteComponent);
        contreteDecoratorB.SetComponent(contreteDecoratorA);
        contreteDecoratorB.operation();
    }
}
