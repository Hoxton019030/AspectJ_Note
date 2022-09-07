package com.example.annotation;

import org.springframework.stereotype.Component;

/**
 * @author Hoxton
 * @version 1.1.0
 */
public class UserProxy {

    public void before(){
        System.out.println("before");
    }
}
