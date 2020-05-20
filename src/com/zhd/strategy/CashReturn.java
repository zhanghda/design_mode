package com.zhd.strategy;

/**
 * 满减收费的子类  如满300 减50
 */
public class CashReturn extends Strategy {

    private double moneyCondition;
    private double moneyReturn;

    public CashReturn() {
    }

    public CashReturn(double moneyCondition, double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }

    @Override
    public double getResult(double money) {
        if (money >= moneyCondition) {
            //计算满减
            return money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return money;
    }
}
