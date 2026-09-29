package com.jatin;

import org.springframework.jdbc.core.JdbcTemplate;

public class SongJDBCDemo {

    public static void main(String[] args) {

        System.out.println("Spring JDBC is loaded successfully!");

        System.out.println("JdbcTemplate class: " +
                JdbcTemplate.class.getName());
    }
}