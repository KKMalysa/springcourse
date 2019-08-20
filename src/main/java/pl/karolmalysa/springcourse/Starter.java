package pl.karolmalysa.springcourse;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
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
    @Override
    public void run (String... args) throws Exception {

        Quest damselRescueQuest = new Quest("Uratuj księżniczkę");      // <---- *1
        Knight JarvanIV = new Knight("Jarvan", 27, damselRescueQuest); // <---- *2
        System.out.println();
        System.out.println(JarvanIV);

        Quest dragonSlayer = new Quest("Zabij smoka");
        Knight Garen = new Knight("Garen", 31, dragonSlayer);
        System.out.println(Garen);

        Quest turnIntoDragon = new Quest("Zmienianie się w smoka");
        Damsel Shyvana = new Damsel("Shyvana",17, turnIntoDragon);
        System.out.println(Shyvana);

    }
}
