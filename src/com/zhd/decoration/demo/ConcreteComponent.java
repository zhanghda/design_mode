package com.zhd.decoration.demo;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {

        System.out.println("对具体类的操作");
    }
}
