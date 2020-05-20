package com.zhd.factory;

public class OperMain {

    public static void main(String[] args) {
        Operate oper = OperFactory.createOper("-");
        oper.setNumberA(4);
        oper.setNumberB(3);
        double result = oper.getResult();
        System.out.println(result);
    }
}
