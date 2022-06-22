package com.carproject.application;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@EnableJpaRepositories(basePackages = { "com.carproject.data" })
@ComponentScan(value = "com.carproject.*")
@EntityScan(basePackages = { "com.carproject.data" })
public class DataSetup {
    @Value("jdbc:h2:file:/data/base")
    String databaseURl;

    @Value("sa")
    String databaseUserName;

    @Value("password")
    String databasePassword;

    @Bean
    public DriverManagerDataSource DataSource(){
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(databaseURl);
        dataSource.setUsername(databaseUserName);
        dataSource.setPassword(databasePassword);
        return dataSource;
    }
}
