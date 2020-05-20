package com.zhd.strategy;

/**
 * 折扣收费的子类
 */
public class CashRebate extends Strategy {

    private double moneyTebate;

    public CashRebate(double moneyTebate){
        this.moneyTebate = moneyTebate;
    }

    @Override
    public double getResult(double money) {
        return money * moneyTebate;
    }
}
