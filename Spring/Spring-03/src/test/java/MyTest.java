import com.terr.pojo.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext content = new ClassPathXmlApplicationContext("beans.xml");
        User user = (User) content.getBean("user");
        user.show();
    }
}
