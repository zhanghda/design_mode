package com.zhd.factory;

/**
 * 做减法操作的类
 */
public class Subtraction extends Operate {

    @Override
    public double getResult() {
        double numberA = super.getNumberA();
        double numberB = super.getNumberB();
        return Math.abs(numberA - numberB);
    }
}
