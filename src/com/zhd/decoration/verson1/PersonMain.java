package com.zhd.decoration.verson1;

/**
 * 该版本可以实现但是如果增加一个超人类就只能在写一套 ，应该把人与服饰分隔开
 * @author zhanghda
 * @version 1.0
 */
public class PersonMain {


    public static void main(String[] args) {
        Person zhangsan = new Person("张三");
        zhangsan.wearClothes();
        zhangsan.wearTrousers();
        zhangsan.show();
    }
}
