import com.terr.dao.UserMapper;
import com.terr.pojo.User;
import com.terr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class UserMapperTest {

    @Test
    public void test(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//        mapper.addUser(new User(666, "iTerry", "dadada"));

        sqlSession.close();
    }
}
