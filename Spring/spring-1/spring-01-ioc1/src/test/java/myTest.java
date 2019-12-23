import com.terry.service.UserServiceImpl;

public class myTest {
    public static void main(String[] args) {
        //用户实际上调用的是业务层,dao层他们不需要接触
        UserServiceImpl userService =  new UserServiceImpl();
        userService.getUser();
    }
}

