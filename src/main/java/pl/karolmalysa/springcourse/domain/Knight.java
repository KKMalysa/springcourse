package pl.karolmalysa.springcourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;




public class Knight {

    private String name;
    private int age;

    private Quest quest;
//
//    public Knight(String name, int age, Quest quest) {
//        this.name=name;
//        this.age=age;
//        this.quest= quest;
//    }

    public Knight(){

    }

    public Knight(String name, int age) {
        this.name=name;
        this.age=age;
    }

//    @Autowired
    public void setQuest(Quest quest) {                          //metoda wstrzykująca
        System.out.println("Rycerz dostaje zadanie.");
        this.quest= quest;
    }


    @Override
    public String toString() {
        return "Rycerz " + name + " (" + age +" lat). Jego zadanie to:"+quest;
    }
}
