import org.junit.Test;
import org.learn.pojo.People;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * IntelliJ IDEA
 *
 * @author Em4non E-mail:kaifenglin@126.com
 * @project_name Spring-Study
 * @package PACKAGE_NAME
 * @className MyTest
 * @date 2023/3/13 13:04
 */
public class MyTest {
    @Test
    public void Test1(){
        ApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext("beans.xml");
        People people = (People) classPathXmlApplicationContext.getBean("people");
        people.getCat().shot();
        people.getDog().shot();
    }
}
