package com.terr.dao;

import com.terr.pojo.User;
import com.terr.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import java.util.List;

public class UserDaoTest {
    @Test
    public void test(){
        //第一步,获取sqlSession对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        //方式一:getMapper
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        List<User> userList = userDao.getUserList();

        for (User user : userList) {
            System.out.println(user);
        }
        //关闭sqlSession
        sqlSession.close();
    }

    @Test
    public void getUserById(){
        //获取执行sql的对象
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        //获得接口
        UserMapper userDao = sqlSession.getMapper(UserMapper.class);
        User user = userDao.getUserById(1);

        System.out.println(user);
        sqlSession.close();
    }
    @Test
    //增删改需要提交事物
    public void addUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();

        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int res = mapper.addUser(new User(88,"self","a322"));

        System.out.println(res);

        if (res > 0)
            System.out.println("插入成功");

        //提交事务
        sqlSession.commit();

        sqlSession.close();
    }
    @Test
    public void updateUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        int i = mapper.updateUser(new User(88,"hh","123"));

        sqlSession.commit();
        sqlSession.close();
    }
    @Test
    public void deleteUser(){
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);

        mapper.deleteUser(88);

        sqlSession.commit();
        sqlSession.close();

    }
}
