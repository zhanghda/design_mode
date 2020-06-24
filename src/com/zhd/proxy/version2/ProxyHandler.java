package com.zhd.proxy.version2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author zhanghda
 * @version 1.0
 */
public class ProxyHandler implements InvocationHandler {

    // 被代理对象
    private Object target;

    /**
     * 绑定关系，也就是关联到哪个接口的invoke方法被调用
     * @param target  代理目标对象
     * @return 返回一个动态代理实例，类似于静态代理里面的Proxy
     */
    public Object newProxyInstance(Object target){
        this.target = target;
        /*
        该方法用于指定类装载器，生成代理实例
        第一个参数 需要指定产生代理对象的类加载器 需要指定与目标代理对象为同一加载器
        第二个参数 要实现代理类的接口列表
        第三个参数 表示被拦截的方法在被拦截时，要执行哪个InvocationHandler的invoke方法

         */
        System.out.println("classLoder:" + target.getClass().getClassLoader());
        System.out.println("inteface:" + Arrays.toString(target.getClass().getInterfaces()));
        System.out.println(this);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }

    /**
     * 关联这个类的方法被调用时将被执行，
     * @param proxy  代理
     * @param method 原对象被调用的方法
     * @param args  方法的参数
     * @return
     * @throws Throwable
     */
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //TODO 原对象调用前可以添加预处理逻辑

        Object ret = null;
        try {
            method.invoke(target,args);
        }catch (Exception e){
            System.out.println("调用发生异常");
            throw e;
        }
        //TODO 原对象调用前可以添加后处理逻辑

        return ret;
    }
}
