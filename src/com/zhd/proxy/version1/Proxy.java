package com.zhd.proxy.version1;

/**
 * @author zhanghda
 * @version 1.0
 */
public class Proxy implements Person{

    private Person person;

    //默认代理自己
    public Proxy(){
        person = new Proxy();
    }

    public Proxy(Person person){
        this.person = person;
    }

    @Override
    public void sendFlower() {
        person.sendFlower();

    }

    @Override
    public void sendWater() {
        person.sendWater();

    }

    @Override
    public void sendBook() {
        person.sendBook();

    }
}
