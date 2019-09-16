package pl.karolmalysa.springcourse.domain;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
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
