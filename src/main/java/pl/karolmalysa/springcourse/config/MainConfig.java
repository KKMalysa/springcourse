package pl.karolmalysa.springcourse.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import pl.karolmalysa.springcourse.domain.repository.DBKnightRepository;
import pl.karolmalysa.springcourse.domain.repository.InMemoryRepository;
import pl.karolmalysa.springcourse.domain.repository.KnightRepository;

@Configuration
public class MainConfig {


    @Bean(name="inMemoryKnightRepository")
    @Profile("dev")
    public KnightRepository createInMemoryRepo(){
        KnightRepository repo = new InMemoryRepository();
        return repo;
    }

    @Bean(name="DBKnightRepository")
    @Profile("prod")
    public KnightRepository createDBRepo(){
        KnightRepository repo = new DBKnightRepository();
        return repo;
    }


}
























