package org.learn.demo03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyInvocationHandler implements InvocationHandler {

    //需要代理的对象接口
    private rent rent;
    public void  setRent(rent rent){
        this.rent=rent;
    }
    //获取代理对象，需要的ClassLoader对象和需要代理的对象接口
    public Object getProxy(){
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), Hoster.class.getInterfaces(),this);
    }


    //重写invoke方法，通过反射调用对应代理类的方法，返回运行结果
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result= method.invoke(rent,args);
        return result;
    }
}
