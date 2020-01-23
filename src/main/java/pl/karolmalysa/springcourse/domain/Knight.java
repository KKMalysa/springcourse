package pl.karolmalysa.springcourse.domain;

import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Objects;


public class Knight {


    private int id;
    @NotNull
    @Size(min = 2, max = 40, message = "Imie rycerza musi mieć między 2, a 40 znaków")
    private String name;
    @NotNull
    @Range(min = 16, max = 67)
    private int age;
    private int level;
    private Quest quest;

    public Knight(){

    }

    public Knight(String name, int age) {
        this.name = name;
        this.age = age;
        this.level = 1;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Knight knight = (Knight) o;
        return age == knight.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public void setQuest(Quest quest) {                          //metoda wstrzykująca
        System.out.println("Rycerz dostaje zadanie.");
        this.quest= quest;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    @Override
    public String toString() {
        return "Rycerz " + name + " (" + age +" lat). Jego zadanie to:"+quest;
    }
}
