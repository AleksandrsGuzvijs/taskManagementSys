package aleks.exercise.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"aleks.exercise.*"})
@EntityScan(basePackages = {"aleks.exercise.*"})
@EnableJpaRepositories(basePackages = {"aleks.exercise.*"})
public class TaskManagementSysApplication {

	public static void main(String[] args) {
		SpringApplication.run(TaskManagementSysApplication.class, args);
	}
}
