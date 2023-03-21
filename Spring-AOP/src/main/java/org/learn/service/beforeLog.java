package org.learn.service;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package org.learn.service
 * @className log
 * @date 2023/3/21 16:42
 */
public class beforeLog implements MethodBeforeAdvice {

    //method 要执行的对象方法
    //args 传入的参数
    //target 目标对象
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println(target.getClass().getName()+"的"+method.getName() + "被执行了");
    }
}
