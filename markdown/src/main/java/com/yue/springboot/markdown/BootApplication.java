package com.yue.springboot.markdown;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * auhtor 千里明月
 */

@SpringBootApplication
@ComponentScan({"com.yue.springboot.markdown"})
public class BootApplication {
	private static ApplicationContext context;
	public static void main(String[] args){
		context = SpringApplication.run(BootApplication.class,args);
	}
}
