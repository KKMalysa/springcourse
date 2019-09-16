package pl.karolmalysa.springcourse.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import pl.karolmalysa.springcourse.domain.Knight;
import pl.karolmalysa.springcourse.domain.Quest;

@Configuration
//@ImportResource("classpath:config/castle-config.xml") // można tak, a można też stworzyć beana
//@PropertySource("classpath:castle.properties")          //ale wtedy trzeba wskazać na propertiesy z których korzysta
public class MainConfig {

    @Autowired
    Quest quest;

    @Primary
    @Bean(name = "sirColder")
    public Knight createSirColderBean(){
        Knight sirColder = new Knight("Sir Colder", 57);
        sirColder.setQuest(quest);

        return sirColder;
    }
    @Bean(name = "Garen")
    public Knight createGarenBean(){
        Knight Garen = new Knight("Garen", 31);
        Garen.setQuest(quest);

        return Garen;
    }

}
























