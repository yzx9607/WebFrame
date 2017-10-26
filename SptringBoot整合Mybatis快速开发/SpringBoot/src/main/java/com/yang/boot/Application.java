package com.yang.boot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * springboot启动类
 * @author Yang
 *
 */
@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("com.yang")
@MapperScan("com.yang.dao")
public class Application {
	//右键run即可启动
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
