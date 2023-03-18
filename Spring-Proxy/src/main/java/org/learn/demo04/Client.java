package org.learn.demo04;

import org.learn.demo02.UserService;
import org.learn.demo02.UserServiceImpl;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        UserService userService=new UserServiceImpl();
        ProxyInvocationHandler proxyInvocationHandler = new ProxyInvocationHandler();
        proxyInvocationHandler.setTarget(userService);
        UserService proxy= (UserService) proxyInvocationHandler.getProxy();
        proxy.add();
        proxy.delete();
        proxy.update();
        proxy.search();
    }
}
