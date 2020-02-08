package com.terr.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//sqlSessionFactory
public class MybatisUtils {

    //提升作用域
    private static SqlSessionFactory sqlSessionFactory;

    //使用mybatis第一步,获取sqlSessionFactory
    static {
        try{
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        }
        catch (IOException e){
            e.printStackTrace();
        }
    }

    //既然有了sqlSessionFactory,顾名思义,我们就可以拿到sqlSession了
    //sqlSession包含了面向数据库执行sql的所有方法

    public static SqlSession getSqlSession(){

        //最后会用这个对象来做操作,sqlSession是工厂中的 作品
        return sqlSessionFactory.openSession();


    }



}
