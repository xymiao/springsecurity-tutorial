package com.xymiao.springsecurity;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class C03SpringSecurityJdbcApplication {

	public static void main(String[] args) {
		SpringApplication.run(C03SpringSecurityJdbcApplication.class, args);
	}
}
