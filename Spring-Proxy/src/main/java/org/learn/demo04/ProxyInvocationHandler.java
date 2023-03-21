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
        return Proxy.newProxyInstance(this.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    /**
     * TODO: 2023/3/21 11:44  重写invoke
     *
     * @param proxy java.lang.Object
     * @param method java.lang.reflect.Method
     * @param args java.lang.Object
     * @return Object
     * @author Em4non
     * @date 2023/3/21 11:44
     * @update_at 2023/3/21 11:44
     */

    //重写invoke方法，可以在调用方法的invoke的时候加入一些额外的操作
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        log(method.getName());
        Object target=method.invoke(this.target,args);
        return target;
    }
    private void log(String msg){
        System.out.println("执行了"+msg+"方法");
    }
}
