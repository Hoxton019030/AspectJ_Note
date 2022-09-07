package com.example.annotation;

import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * @author Hoxton
 * @version 1.1.0
 */
@Service
@Aspect
public class BusinessService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


}
