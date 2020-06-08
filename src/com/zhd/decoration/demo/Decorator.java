package com.zhd.decoration.demo;

/**
 * @author zhanghda
 * @version 1.0
 */
public abstract class Decorator implements Component{

    private Component component;

    public void SetComponent(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        if(component != null){
            component.operation();
        }
    }
}
