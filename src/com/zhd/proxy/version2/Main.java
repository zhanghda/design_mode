package com.zhd.proxy.version2;

import java.lang.reflect.Proxy;

/**
 * @author zhanghda
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        ProxyHandler proxyHandler = new ProxyHandler();
        Subject o = (Subject)proxyHandler.newProxyInstance(new ConcreteSubject());
        o.request();

        System.out.println(Proxy.isProxyClass(o.getClass()));
    }
}
