package pl.karolmalysa.springcourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//@Component
//@Scope("prototype") //za każdym razem, kiedy inny bean ma zależność rycerza, jest tam wstrzykiwana nowa instancja tej klasy.
public class Knight {

    private String name;
    private int age;

    private Quest quest;

    public Knight(){
        this.name="Sir Colder";
        this.age=57;
    }

    public Knight(String name, int age) {
        this.name=name;
        this.age=age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Autowired
    public void setQuest(Quest quest) {                          //metoda wstrzykująca
        System.out.println("Rycerz dostaje zadanie.");
        this.quest= quest;
    }


    @Override
    public String toString() {
        return "Rycerz " + name + " (" + age +" lat). Jego zadanie to:"+quest;
    }
}
