package pl.karolmalysa.springcourse.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ImportResource("classpath:config/castle-config.xml") // można tak, a można też stworzyć beana
//@PropertySource("classpath:castle.properties")          //ale wtedy trzeba wskazać na propertiesy z których korzysta
public class MainConfig {

//    @Bean
//    public Quest createQuest(){
//        return new Quest();
//    }
//
//    @Bean
//    public Knight knight(){
//        Knight knight = new Knight("Sir Colder", 57);
//        knight.setQuest(createQuest());
//
//        return knight;
//    }
//
//    @Value("${my.castle.name}")
//    String name;
//
//    @Bean (name = "zamek", initMethod = "build", destroyMethod = "tearDown")
//    public Castle castle(){
//        Castle castle = new Castle(knight()); //wstrzykiwanie przez konstruktor
//        castle.setName(name);
//
//        return castle;
//    }

}
























