package xyz.tohrxyz.java.spring.spring_edu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"xyz.tohrxyz.java.spring.spring_edu"})
public class SpringEduApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringEduApplication.class, args);
	}

}
