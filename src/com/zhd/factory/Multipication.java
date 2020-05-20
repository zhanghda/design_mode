package com.zhd.factory;

/**
 * 做乘法操作的类
 */
public class Multipication extends Operate {

    @Override
    public double getResult() {
        double numberA = super.getNumberA();
        double numberB = super.getNumberB();
        return numberA * numberB;
    }
}
