package org.learn.service;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package org.learn.service
 * @className userServiceImpl
 * @date 2023/3/21 16:39
 */
public class userServiceImpl implements userService{
    @Override
    public void add() {
        System.out.println("执行了add方法");
    }

    @Override
    public void delete() {
        System.out.println("执行了delete方法");
    }

    @Override
    public void update() {
        System.out.println("执行了update方法");
    }

    @Override
    public void query() {
        System.out.println("执行了query方法");
    }
}
