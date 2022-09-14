package com.itheima;

import com.itheima.dao.UserDao;
import com.itheima.factory.UserDaoFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForInstanceUser {
    public static void main(String[] args) {
        UserDaoFactory userDaoFactory = new UserDaoFactory();
        UserDao userDao = userDaoFactory.getUserDao();
        userDao.save();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserDao userDao1 = (UserDao) ctx.getBean("userDao");
        UserDao userDao2 = (UserDao) ctx.getBean("userDao");
        //单例对象 如何修改为非单例 见UserDaoFactoryBean
        System.out.println(userDao1);
        System.out.println(userDao2);
        userDao1.save();
    }
}
