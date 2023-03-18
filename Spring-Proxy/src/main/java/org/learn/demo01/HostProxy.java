package org.learn.demo01;

public class HostProxy implements rent{
    Hoster hoster;

    public HostProxy(Hoster hoster) {
        this.hoster = hoster;
    }

    public HostProxy() {
    }

    @Override
    public void rent() {
        see();
        hoster.rent();
        pay();
    }
    private void pay(){
        System.out.println("收中介费");
    }
    private void see(){
        System.out.println("看房");
    }

}
