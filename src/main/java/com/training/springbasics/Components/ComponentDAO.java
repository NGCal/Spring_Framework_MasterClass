package com.training.springbasics.Components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class ComponentDAO {
    @Autowired
    JdbcComponent jdbcComponent;

    public JdbcComponent getJdbcComponent() {
        return jdbcComponent;
    }

    public void setJdbcComponent(JdbcComponent jdbcComponent) {
        this.jdbcComponent = jdbcComponent;
    }
}
