package com.itheima;

import com.itheima.dao.BookDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AppForLifeCycle {
    public static void main( String[] args ) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml")
        //Exception in thread "main" java.lang.IllegalStateException: BeanFactory not initialized or already closed - call 'refresh' before accessing beans
        //ctx.close();
        BookDao bookDao = (BookDao) ctx.getBean("bookDao");
        bookDao.save();
        //注册关闭钩子函数，在虚拟机退出之前回调此函数，关闭容器 关闭钩子 ☆在任何时间都可以
        //ctx.registerShutdownHook();
        //关闭容器 暴力关闭
        ctx.close();
        //两种方式开发中都不常使用 web开发中伴随tomcat关闭
    }
}
