package org.learn.pojo;
import  org.springframework.beans.factory.annotation.Autowired;
/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package org.learn.pojo
 * @className People
 * @date 2023/3/13 12:52
 */


public class People {
    @Autowired
    private Cat cat;
    @Autowired
    private Dog dog;
    private String name;

    public People() {
    }

    public Cat getCat() {
        return this.cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Dog getDog() {
        return this.dog;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}