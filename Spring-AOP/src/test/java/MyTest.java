import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.learn.service.userService;
/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package PACKAGE_NAME
 * @className MyTest
 * @date 2023/3/21 17:04
 */
public class MyTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext xmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
         userService userService = (userService) xmlApplicationContext.getBean("user");
         userService.add();

    }
}
