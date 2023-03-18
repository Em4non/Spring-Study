package org.learn.demo02;

public class Client {
    public static void main(String[] args) {
        UserService service=new UserServiceImpl();
        UserServiceProxy userServiceProxy=new UserServiceProxy(service);
        userServiceProxy.add();
        userServiceProxy.delete();
        userServiceProxy.update();
        userServiceProxy.search();


    }
}
