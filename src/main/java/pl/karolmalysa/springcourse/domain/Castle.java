package pl.karolmalysa.springcourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
//@PropertySource("classpath:castle.properties")
public class Castle {

//    @Value("${my.castle.name}")
    private String name;

    Knight knight;

//    @Autowired
    public Castle(Knight knight) {
        this.knight=knight;
    }

    /**
     * Konstruktor wstrzykujący na potrzeby klasy testowej po to, by wstrzyknięte do klasy Castle dane
     * działały również w testach.
     * @param knight
     * @param name
     */
    Castle(Knight knight, String name ){
        this.knight = knight;
        this.name = name;
    }

//    @PostConstruct
    public void build() {
        System.out.println("Zamek " + name + " został wybudowany! Magiczny smok z groty pod zamkiem wk... się zdenerwował :D ");
    }
//    @PreDestroy
    public void tearDown() {
        System.out.println("Zamek " + name + " zostanie zaraz całkowicie spłonie po ataku magicznego smoka i Księżniczki (smoczycy) Shyvany :D");
    }

    @Override
    public String toString(){
        return "   Oto zamek o nazwie "+ this.name +", w którym mieszka "+knight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
