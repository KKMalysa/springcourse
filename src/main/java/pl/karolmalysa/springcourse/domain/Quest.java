package pl.karolmalysa.springcourse.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {

    private String description;


    public Quest () {
        this.description="Zabij smoka i uratuj księżniczkę";
    }

    @Override
    public String toString() {
        return description;
    }
}
