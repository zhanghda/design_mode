package com.zhd.strategy;

/**
 * 正常收费的子类
 */
public class CashNormal extends Strategy {
    @Override
    public double getResult(double money) {
        return money;
    }
}
