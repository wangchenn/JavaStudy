package com.itheima;

import com.itheima.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 {
    public static void main(String[] args) {
        //3.获取IoC容器
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
        //4.获取bean（根据bean配置id获取）
//        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
//        bookDao.save();

        BookService bookService = (BookService) ctx.getBean("新的名字");
//        BookService bookService = (BookService) ctx.getBean("failed"); 不是这里写错了 就是 application里的名字有错误
//        Exception in thread "main" org.springframework.beans.factory.NoSuchBeanDefinitionException: No bean named 'failed' available
        bookService.save();

    }
}
