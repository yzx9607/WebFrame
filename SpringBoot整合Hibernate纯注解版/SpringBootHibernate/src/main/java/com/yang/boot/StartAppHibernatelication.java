package com.yang.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages={"com.yang"}) // 扫描该包路径下的所有spring组件
@EnableJpaRepositories("com.yang.dao") // JPA扫描该包路径下的Repositorie

@SpringBootApplication
public class StartAppHibernatelication {
	public static void main(String[] args) {
		SpringApplication.run(StartAppHibernatelication.class, args);
	}
}
