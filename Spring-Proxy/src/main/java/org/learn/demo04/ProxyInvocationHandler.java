package org.learn.demo04;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //被代理的接口
    private Object target;
    //给当前代理类导入接口
    public void setTarget(Object target){
        this.target=target;
    }
    //获取代理类

    public Object getProxy(){
        Object result = Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
        return result;
    }


    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object result=method.invoke(target,args);
        return result;
    }
    private void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
