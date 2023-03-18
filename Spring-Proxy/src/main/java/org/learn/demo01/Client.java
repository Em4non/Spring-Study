package org.learn.demo01;

public class Client {


    public static void main(String[] args) {
        Hoster hoster=new Hoster();
        HostProxy hostProxy=new HostProxy(hoster);
        hostProxy.rent();
    }
}
