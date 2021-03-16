package com.training.springbasics.springin10steps.Scope;

import org.springframework.stereotype.Component;

@Component
public class JdbcConnection {
    public JdbcConnection() {
        System.out.println("This is my JDBC Connection");
    }
}
