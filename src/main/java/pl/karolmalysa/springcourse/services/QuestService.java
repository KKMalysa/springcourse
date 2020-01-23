package pl.karolmalysa.springcourse.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import pl.karolmalysa.springcourse.domain.Quest;
import pl.karolmalysa.springcourse.domain.repository.InMemoryRepository;
import pl.karolmalysa.springcourse.domain.repository.KnightRepository;
import pl.karolmalysa.springcourse.domain.repository.QuestRepository;

import java.util.List;
import java.util.Random;

@Service
public class QuestService {

    @Autowired
    KnightRepository knightRepository;

    @Autowired
    QuestRepository questRepository;

    final static Random rand= new Random();

    public void assignRandomQuest (String knightName) {
        List<Quest> allQuests = questRepository.getAll();
        Quest randomQuest = allQuests.get(rand.nextInt(allQuests.size()));
        knightRepository.getKnight(knightName).ifPresent(knight -> knight.setQuest(randomQuest));
        questRepository.deleteQuest(randomQuest);
    }


}
