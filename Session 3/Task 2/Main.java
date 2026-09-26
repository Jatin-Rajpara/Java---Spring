package com.jatin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserSession user1 = context.getBean("UserSession", UserSession.class);
        UserSession user2 = context.getBean("UserSession", UserSession.class);

        AppConfig config1 = context.getBean("AppConfig", AppConfig.class);
        AppConfig config2 = context.getBean("AppConfig", AppConfig.class);

        System.out.println("UserSession same: " + (user1 == user2));
        System.out.println("AppConfig same: " + (config1 == config2));
    }
}