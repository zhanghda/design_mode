package com.zhd.proxy.version2;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ConcreteSubject implements Subject{

    @Override
    public void request() {
        System.out.println("我是具体的方法");
    }


}
