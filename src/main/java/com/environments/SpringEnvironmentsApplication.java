package com.environments;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class SpringEnvironmentsApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEnvironmentsApplication.class, args);
    }

}
