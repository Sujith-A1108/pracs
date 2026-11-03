package com.example.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.commons.lang3.StringUtils;

public class App 
{
    public static final Logger logger = LoggerFactory.getLogger(App.class);
    public static void main( String[] args )
    {
        String name ="CI/CD";
        if(StringUtils.isNotBlank(name)){
            String msg = greet(name);
            logger.info(msg);
            System.out.println(msg);
        } else {
            System.out.println("Name is empty");
        }
    }
    public static String greet(String name){
        return "Hello, " + name + "!, Welcome to the CI/CD pipeline.";
    }
}
