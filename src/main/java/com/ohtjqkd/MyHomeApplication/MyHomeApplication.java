package com.ohtjqkd.MyHomeApplication;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication(scanBasePackages = {"com.ohtjqkd"})
@Log4j2
public class MyHomeApplication {
	public static void main(String[] args) {
		log.info("Hello, world");
		SpringApplication.run(MyHomeApplication.class, args);
	}
}