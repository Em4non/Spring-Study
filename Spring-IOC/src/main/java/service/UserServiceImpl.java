package service;

import dao.UserDao;
import dao.UserDaoImpl;
import dao.UserDaoMysqlImpl;

public class UserServiceImpl implements UserService{
    private UserDao userDao=new UserDaoMysqlImpl();


    public void getUser() {
        userDao.getUser();
    }
}
