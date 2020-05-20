package com.zhd.factory;

/**
 * 计算的工厂
 */
public class OperFactory {

    public  static Operate createOper(String oper){
        Operate operate = null;
        switch (oper){
            case "+":
                operate = new Add();
                break;
            case "-":
                operate = new Subtraction();
                break;
            case "*":
                operate = new Multipication();
                break;
            case "/":
                operate = new Division();
                break;
        }
        return operate;
    }
}
