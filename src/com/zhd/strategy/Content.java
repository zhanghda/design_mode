package com.zhd.strategy;

/**
 * 具体策略类
 */
public class Content {

    private Strategy strategy;
    private Strategy strategy2;

    /**
     * 单一的折扣
     * @param type
     */
    public Content(String type){
        switch (type){
            case "正常":
                strategy = new CashNormal();
                break;
            case "满300减50":
                strategy = new CashReturn(300,50);
                break;
            case "打八折":
                strategy = new CashRebate(0.8);
                break;
            case "打八折+满300减50":
                strategy = new CashRebate(0.8);
                strategy2 = new CashReturn(300,50);
                break;
        }
    }

    //具体计算方法
    public double oper(double money){
        return strategy.getResult(money);
    }
    //具体计算方法
    public double oper2(double money){
        double result = strategy.getResult(money);
        return strategy2.getResult(result);
    }
}
