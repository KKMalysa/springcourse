package pl.karolmalysa.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.karolmalysa.springcourse.domain.Castle;
import pl.karolmalysa.springcourse.domain.Tournament;

@Component("starter")
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired       // W mega skrócie: ta adnotacja pozwala wstrzykiwać jedne Beansy do drugich. Notatki rozdział 2_3
    Castle castle;

    @Autowired
    Tournament tournament;

    @Override
    public void run (String... args) throws Exception {

        System.out.println(castle);
        System.out.println();
        System.out.println("---------------------------------------------------------------------------------");
        tournament.duel();
        System.out.println(tournament);
        System.out.println("---------------------------------------------------------------------------------");
        System.out.println(castle);


//        Quest damselRescueQuest = new Quest("Uratuj księżniczkę.");      // <---- *1
//        Knight JarvanIV = new Knight("Jarvan", 27, damselRescueQuest); // <---- *2
//        System.out.println("--------------------------------------------------------------------------------------------");
//        System.out.println(JarvanIV);
//
//        Quest dragonSlayer = new Quest("Zabij smoka.");
//        Knight Garen = new Knight("Garen", 31);
//        System.out.println();
//        System.out.println(Garen + "- - - - - - - Before quest injection - - -");
//        Garen.setQuest(dragonSlayer);
//        System.out.println(Garen + "- - - After quest injection - - -");
//
//        Damsel Shyvana = Damsel.getInstance();
//        System.out.println();
//        System.out.println(Shyvana);
//        System.out.println("--------------------------------------------------------------------------------------------");
    }

}
