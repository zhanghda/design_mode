package com.zhd.factory;

public class Add extends Operate {

    @Override
    public double getResult() {
        double numberA = super.getNumberA();
        double numberB = super.getNumberB();
        return numberA + numberB;
    }
}
