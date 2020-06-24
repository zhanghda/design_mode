package com.zhd.proxy.version1;

/**
 * @author zhanghda
 * @version 1.0
 */
public class Main {

    public static void main(String[] args) {
        Pursuit pursuit = new Pursuit("张三");
        Proxy proxy = new Proxy(pursuit);
        proxy.sendBook();

    }
}
