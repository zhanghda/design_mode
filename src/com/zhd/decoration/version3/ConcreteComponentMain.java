package com.zhd.decoration.version3;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ConcreteComponentMain {

    public static void main(String[] args) {

        ConcreteComponent cc = new ConcreteComponent("小红");
        Clothes clothes = new Clothes();
        Troustors troustors = new Troustors();

        troustors.setConcreteComponent(cc);
        clothes.setConcreteComponent(troustors);
        clothes.operation();
    }
}
