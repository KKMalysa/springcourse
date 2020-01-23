package pl.karolmalysa.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;


@SpringBootApplication
@EnableScheduling
public class SpringcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcourseApplication.class, args);
	}
}
