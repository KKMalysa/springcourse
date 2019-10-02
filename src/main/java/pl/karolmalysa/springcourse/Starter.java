package pl.karolmalysa.springcourse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.karolmalysa.springcourse.domain.repository.KnightRepository;
import pl.karolmalysa.springcourse.domain.repository.QuestRepository;
import pl.karolmalysa.springcourse.services.QuestService;

import java.sql.SQLOutput;

@Component
@Scope("singleton")
public class Starter implements CommandLineRunner {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    @Autowired
    QuestService questService;

    @Override
    public void run (String... args) throws Exception {

        questRepository.createRandomQuests();
        System.out.println(questRepository);
        questRepository.createRandomQuests();
        System.out.println(questRepository);
        questRepository.createRandomQuests();
        System.out.println(questRepository);

        questService.assignRandomQuest("sir McGregor");
        System.out.println(knightRepository);
        questService.assignRandomQuest("sir Colder");
        System.out.println(knightRepository);
        questService.assignRandomQuest("sir Emmentaler");
        System.out.println(knightRepository);
    }

}
