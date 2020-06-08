package com.zhd.decoration.version3;

/**
 *
 * 衣服类
 * @author zhanghda
 * @version 1.0
 */
public class Troustors extends Decorator {

    private String color = "帅气的牛仔";


    @Override
    public void operation() {
        super.operation();
        System.out.println(color);
    }

}
