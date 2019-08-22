package pl.karolmalysa.springcourse.domain;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * dla treningu i dodania tej historii odrobiny dramaturgii, postanowiłem utworzyć naszą księżniczkę,
 * tak, żeby rucerz Jarvan miał kogo ratować ;)
 * Ale jej aktualne zajęcie, to zamienianie się w smoka, tak, żeby rycerz Garen miał kogo zaszlachtować :D
 * Jak ta historia otoczy się dalej?                   TEGO DOWIECIE SIĘ W NASTĘPNYM ODCINKU :D
 */

public class Damsel {
    private String name;
    private int age;

    private Quest quest;

    public Damsel(String name, int age, Quest quest) {
        this.name = name;
        this.age = age;
        this.quest = quest;
    }

    @Override
    public String toString(){
        return "Księżniczka " + name + " (lat " + age + "). Jej aktualne zajęcie to: " + quest;
    }

}

