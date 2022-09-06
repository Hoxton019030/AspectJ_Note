package com.example.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author Hoxton
 * @version 1.1.0
 */
public class JDKProxy {

    public static void main(String[] args) {
        Class[] interfaces = {UserDao.class};
        UserDaoImpl userDao = new UserDaoImpl();
        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));
        //此dao已經不是原本的dao，而是新的代理類dao了
        int result = dao.add(1, 2);
        System.out.println("result = " + result);
    }
}
//創建代理對象的代碼
class UserDaoProxy implements InvocationHandler {

    //1. 把創建的是誰的代理對象，把誰傳遞進來
    // 有參建構子
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }


    //增強的邏輯
    @Override
    public Object invoke(Object proxy, Method method, Object[] methodArgs) throws Throwable {

        //方法之前
        System.out.println("方法之前執行..." + method.getName() + "傳遞的參數..." + Arrays.toString(methodArgs));
        //被增強的方法執行
        Object res = method.invoke(obj, methodArgs);
        //方法之後
        System.out.println("方法之後執行..." + obj);

        return res;
    }
}