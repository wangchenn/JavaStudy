package com.itheima;

import com.itheima.dao.BookDao;
import jdk.swing.interop.SwingInterOpUtils;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForScope {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean（根据bean配置id获取）
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        BookDao bookDao1 = (BookDao) ctx.getBean("bookDao");
        System.out.println(bookDao);
        System.out.println(bookDao1);
        //Spring创建的对象是单例的

    }
}
