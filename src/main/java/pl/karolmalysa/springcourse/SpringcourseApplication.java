package pl.karolmalysa.springcourse;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import pl.karolmalysa.springcourse.domain.Castle;
import pl.karolmalysa.springcourse.domain.Damsel;
import pl.karolmalysa.springcourse.domain.Knight;
import pl.karolmalysa.springcourse.domain.Quest;


@SpringBootApplication
//@ComponentScan({"pl.karolmalysa.springcourse","pl.karolmalysa.component"})
//@ComponentScan(basePackageClasses = {Starter.class, Castle.class, Damsel.class, Knight.class, Quest.class, TestComponent.class})
@ImportResource("classpath:config/spring-config.xml")
public class SpringcourseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcourseApplication.class, args);
	}
}
