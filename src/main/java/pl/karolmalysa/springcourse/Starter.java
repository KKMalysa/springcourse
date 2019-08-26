package pl.karolmalysa.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import pl.karolmalysa.springcourse.domain.Castle;
import pl.karolmalysa.springcourse.domain.Damsel;
import pl.karolmalysa.springcourse.domain.Knight;
import pl.karolmalysa.springcourse.domain.Quest;


/** WSTRZYKIWANIE ZALEŻNOŚCI PRZEZ KONSTRUKTOR
 *
 * Korzystając z konstruktora zaimportowanej tu klasy Quest tworzę tutaj jego obiekt, <---- *1
 * po czym podaję go jako argument przy tworzeniu rycerza. <---- *2
 *
 * Dzięki temu nie muszę tworzyć nowej klasy dla każdego questa.
 */
@Component
public class Starter implements CommandLineRunner {

    @Autowired       // W mega skrócie: ta adnotacja pozwala wstrzykiwać jedne Beansy do drugich. Notatki rozdział 2_3
    Castle castle;

    @Override
    public void run (String... args) throws Exception {

        System.out.println(castle);
        Quest damselRescueQuest = new Quest("Uratuj księżniczkę.");      // <---- *1
        Knight JarvanIV = new Knight("Jarvan", 27, damselRescueQuest); // <---- *2
        System.out.println("--------------------------------------------------------------------------------------------");
        System.out.println(JarvanIV);

        Quest dragonSlayer = new Quest("Zabij smoka.");
        Knight Garen = new Knight("Garen", 31);
        System.out.println();
        System.out.println(Garen + "- - - - - - - Before quest injection - - -");
        Garen.setQuest(dragonSlayer);
        System.out.println(Garen + "- - - After quest injection - - -");

        Damsel Shyvana = Damsel.getInstance();
        System.out.println();
        System.out.println(Shyvana);
        System.out.println("--------------------------------------------------------------------------------------------");

    }

}
