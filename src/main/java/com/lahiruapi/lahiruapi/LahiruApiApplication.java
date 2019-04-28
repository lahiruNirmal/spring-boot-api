package com.lahiruapi.lahiruapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.EnvironmentCapable;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.framework.AopProxyUtils;
import org.springframework.expression.PropertyAccessor;

@SpringBootApplication
public class LahiruApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(LahiruApiApplication.class, args);
	}

}
