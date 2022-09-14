package com.itheima.dao.impl;

import com.itheima.dao.BookDao;

public class BookDaoImpl implements BookDao {
    //spring创建bean 是调用无参构造方法
    //无参构造方法如果不存在 将抛出异常 BeanCreationException
    private BookDaoImpl() {
        System.out.println("Book dao constructor is running");
    }

    @Override
    public void save() {
        System.out.println("book~~~~~");
    }
}
