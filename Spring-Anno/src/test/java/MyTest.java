import org.junit.Test;
import org.learn.pojo.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package PACKAGE_NAME
 * @className MyTest
 * @date 2023/3/13 10:55
 */
public class MyTest {
    @Test
    public void test(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) context.getBean("user");
        System.out.println(user.name);
    }
}
