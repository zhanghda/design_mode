package com.zhd.factory;

/**
 * 做除法操作的类
 */
public class Division extends Operate {

    @Override
    public double getResult() {
        double numberA = super.getNumberA();
        double numberB = super.getNumberB();
        return numberA / numberB;
    }
}
