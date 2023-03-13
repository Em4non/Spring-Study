
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.UserService;


public class main {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
        UserService user= (UserService) context.getBean("service");
        user.getUser();
    }
}
