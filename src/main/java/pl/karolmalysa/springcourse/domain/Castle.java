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
        System.out.println("Zamek " + name + " został wybudowany! Magiczny smok z groty pod zamkiem wk... zdenerwował się!");
    }
    @PreDestroy
    public void tearDown() {
        System.out.println("Zamek " + name + " zostanie zaraz całkowicie spłonie po ataku magicznego smoka i Księżniczki (smoczycy) Shyvany :D");
    }

    @Override
    public String toString(){
        return "   Oto zamek o nazwie "+ this.name +" Jeśli to czytasz, to znaczy, że wstrzyknięcie beana do komponentu starter się powiodło. <-------------------------------------------------- TO TUTAJ! -------------TUTAJ TO TOTO! --------O! TU TO, WIDZISZ?";
    }

}
