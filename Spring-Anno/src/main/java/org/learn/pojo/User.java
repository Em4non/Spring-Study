package org.learn.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package pojo
 * @className User
 * @date 2023/3/13 10:51x
 */
@Component
public class User {
    @Value("EM4")
    public String name;

    public void setName(String name) {
        this.name = name;
    }
}
