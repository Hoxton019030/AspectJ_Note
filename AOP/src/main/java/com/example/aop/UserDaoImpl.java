package com.example.aop;

/**
 * @author Hoxton
 * @version 1.1.0
 */
public class UserDaoImpl implements UserDao{
    @Override
    public int add(int a, int b) {
        System.out.println("add方法執行了");
        return a+b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
