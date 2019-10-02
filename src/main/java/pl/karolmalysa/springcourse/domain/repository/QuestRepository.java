package pl.karolmalysa.springcourse.domain.repository;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Repository;
import pl.karolmalysa.springcourse.domain.Quest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Repository
public class QuestRepository {

    Random rand = new Random();
    List<Quest> questList = new ArrayList<>();

    public void createQuest (String description) {
        questList.add(new Quest(description));
    }


    public void deleteQuest(Quest quest){
        questList.remove(quest);
    }

    public List<Quest> getAll(){
        return questList;
    }

    @PostConstruct
    public void init(){

    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }

    @Scheduled(fixedDelayString = "${questCreationDelay}")
    public void createRandomQuests(){
        List<String> descriptions = new ArrayList<>();

        descriptions.add("Uratuj księżniczkę");
        descriptions.add("Zabij bazyliszka");
        descriptions.add("Zabij smoka");
        descriptions.add("Zbadaj nawiedzony dom");
        descriptions.add("Schwytaj bandytów");
        descriptions.add("Eskortuj kupiecką karawanę");
        descriptions.add("Weź udział w wyscigu konnym");
        descriptions.add("Weź udział w królewskim polowaniu");
        descriptions.add("Weź udział w turnieju rycerskim");
        descriptions.add("Udaj się na zwiad do sąsiedniego królestwa");
        descriptions.add("Zbadaj jaskinię u podnóża góry");
        descriptions.add("Zbadaj mroczny las");

        String description = descriptions.get(rand.nextInt(descriptions.size()));
        System.out.println("Utworzono zadanie: " + description);
        createQuest(description);
    }

}
