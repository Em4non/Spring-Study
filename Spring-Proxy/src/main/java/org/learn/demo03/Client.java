package org.learn.demo03;

import java.lang.reflect.Proxy;

public class Client {
    public static void main(String[] args) {
        Hoster hoster=new Hoster();
        ProxyInvocationHandler proxyInvocationHandler=new ProxyInvocationHandler();
        proxyInvocationHandler.setRent(hoster);
        rent proxy = (rent) proxyInvocationHandler.getProxy();

        proxy.rent();
    }

}
