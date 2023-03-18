import org.junit.Test;
import org.learn.pojo.User;
import org.learn.pojo.config.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package test.java
 * @className MyTest
 * @date 2023/3/14 08:30
 */


public class MyTest {

    @Test
    public void Test1(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        User user = (User) context.getBean("user");
        user.setName("em4");
        System.out.println(user.toString());
    }
}
