package com.itheima;

import com.itheima.Mapper.BlackMapper;
import com.itheima.pojo.BlackList;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author 代理开发
 */
public class MybatisDemo2 {
    public static void main(String[] args) throws IOException {
        //加载mybatis的核心配置文件,获取SqlSessionFactory
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        //获取SqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //执行sql
//        List<Object> selectBlack = sqlSession.selectList("selectBlack");

        //获取BlackMapper接口的代理对象
        BlackMapper mapper = sqlSession.getMapper(BlackMapper.class);
        List<BlackList> blackLists = mapper.selectBlack();
        System.out.println(blackLists);
        sqlSession.close(); 

    }
}

