package com.jatin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserProfile userProfile =
                context.getBean("userProfile", UserProfile.class);

        userProfile.sendNotification();
    }
}