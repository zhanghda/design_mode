package com.zhd.decoration.verson2;

/**
 * @author zhanghda
 * @version 1.0
 */
public class PersonMain {

    public static void main(String[] args) {
        Person zs = new Person("张三");
        zs.shwow();
        Tshirts tshirts = new Tshirts();
        Trouser trouser = new Trouser();
        tshirts.show();
        trouser.show();
    }
}
