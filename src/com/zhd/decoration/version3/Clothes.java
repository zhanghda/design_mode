package com.zhd.decoration.version3;

/**
 *
 * 衣服类
 * @author zhanghda
 * @version 1.0
 */
public class Clothes extends Decorator {

    private String color = "淡黄色的长裙";




    @Override
    public void operation() {
        super.operation();
        a();
    }

    public void a(){
        System.out.println("穿上"+color+"真好看嗯");
    }
}
