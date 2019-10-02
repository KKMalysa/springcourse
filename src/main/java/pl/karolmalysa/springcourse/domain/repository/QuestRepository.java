package pl.karolmalysa.springcourse.domain.repository;

import org.springframework.stereotype.Repository;
import pl.karolmalysa.springcourse.domain.Quest;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Repository
public class QuestRepository {

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
        createQuest("Uratuj ksiezniczke");
        createQuest("Zabij smoka");
        createQuest("Weź udział w turnieju rycerskim");
        createQuest("Weź udział w wyscigu konnym");
        createQuest("Weź udział w królewskim polowaniu");
        createQuest("Schwytaj bandytów napadajacych na wioskę");
    }

    @Override
    public String toString() {
        return "QuestRepository{" +
                "questList=" + questList +
                '}';
    }
}
