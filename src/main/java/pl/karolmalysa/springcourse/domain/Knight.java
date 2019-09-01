package pl.karolmalysa.springcourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;


@Component
@PropertySource("classpath:knight.properties")
public class Knight {
//    @Value("${my.knight.name:Wartość Domyślna}")      // ta adnotacja służy do wstrzykiwania typów prymitywnych znajdujących się w pliku properties
    private String name = "Skrzetuski";
//    @Value("57")            // a to "na sztywno", to jest równoznaczne z private int age = 57; zamiast tej adnotacji
    private int age = 57;

    private Quest quest;
//
//    public Knight(String name, int age, Quest quest) {
//        this.name=name;
//        this.age=age;
//        this.quest= quest;
//    }

    public Knight(){

    }

//    public Knight(String name, int age) {
//        this.name=name;
//        this.age=age;
//    }

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Rycerz dostaje zadanie.");
        this.quest= quest;
    }


    @Override
    public String toString() {
        return "Rycerz " + name + " (" + age +" lat). Jego zadanie to:"+quest;
    }
}
