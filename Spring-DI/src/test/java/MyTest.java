import org.junit.Test;
import org.learn.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package PACKAGE_NAME
 * @className MyTest
 * @date 2023/3/13 13:11
 */
public class MyTest {
    @Test
    public void test() {
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("userBeans.xml");
        User user = (User) classPathXmlApplicationContext.getBean("user");
        System.out.println(user.toString());
    }
}
