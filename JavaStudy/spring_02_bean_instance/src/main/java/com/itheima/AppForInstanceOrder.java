package com.itheima;

import com.itheima.dao.OrderDao;
import com.itheima.factory.OrderDaoFactory;

public class AppForInstanceOrder {
    public static void main(String[] args) {
        OrderDao orderDao = OrderDaoFactory.getOrderDao();
        orderDao.save();
    }
}

