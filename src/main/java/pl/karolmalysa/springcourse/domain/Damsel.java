package pl.karolmalysa.springcourse.domain;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Klasa stworzona dla treningu, zabawy i dodania tej historii odrobiny dramaturgii,
 * żeby rucerz Jarvan miał kogo ratować ;)
 * Jej aktualne zajęcie, to zamienianie się w smoka, tak, żeby rycerz Garen miał kogo zaszlachtować :D
 * Jak ta historia otoczy się dalej?
 */
@Component
public class Damsel {
    private String name ="Shyvana";
    private int age = 17;
    private Quest quest = new Quest("zmienianie się w smoka.");

    private static Damsel instance = new Damsel();

    public Damsel() {

    }

    @PostConstruct
    public void born(){
        System.out.println("Księżniczka "+ name + " urodziła się");
    }
    @PreDestroy
    public void death(){
        System.out.println("Księżniczka "+name+" zaraz umrze, bo zatruła się dlugo niemytym rycerzem :D ");
    }

    @Override
    public String toString(){
        return "Księżniczka " + name + " (lat " + age + "). Jej aktualne zajęcie to: " + quest;
    }

    public static Damsel getInstance(){

        return instance;
    }
}

