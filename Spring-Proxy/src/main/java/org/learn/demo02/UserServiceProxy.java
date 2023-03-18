package org.learn.demo02;

public class UserServiceProxy implements UserService{
    UserService userService=new UserServiceImpl();

    public UserServiceProxy(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void add() {
        log("add");
        userService.add();
    }

    @Override
    public void delete() {
        log("delete");
        userService.delete();
    }

    @Override
    public void update() {
        log("update");
        userService.update();
    }

    @Override
    public void search() {
        log("search");
        userService.search();
    }
    private void log(String msg){
        System.out.println("执行了"+msg+"业务");

    }
}
