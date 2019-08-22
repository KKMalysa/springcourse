package pl.karolmalysa.springcourse.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Castle {

    private String name = "Wawel";

    public Castle() {

    }

    @PostConstruct
    public void build() {
        System.out.println("Zamek " + name + " został wybudowany! Magiczny smok z groty pod zamkiem porywa księżniczkę!");
    }
    @PreDestroy
    public void tearDown() {
        System.out.println("Zamek " + name + " zostanie zaraz spalony przez magicznego smoka i smoczycę Shyvanę :D");
    }

}
