package org.learn.pojo;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package org.learn.pojo
 * @className USer
 * @date 2023/3/13 13:11
 */

public class User {
    private String name;
    private int age;

    public User() {
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "User{name='" + this.name + "', age=" + this.age + "}";
    }
}
