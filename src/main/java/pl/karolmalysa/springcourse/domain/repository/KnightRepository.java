package pl.karolmalysa.springcourse.domain.repository;

import org.springframework.stereotype.Repository;
import pl.karolmalysa.springcourse.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Repository
public class KnightRepository {


    Map<String, Knight> knights = new HashMap<>();

    public KnightRepository() {

    }


    public void createKnight(String name, int age){
        knights.put(name, new Knight(name, age));
    }

    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    public Knight getKnight(String name){
        return knights.get(name);
    }

    public void deleteKnight(String name){
        knights.remove(name);
    }

    @PostConstruct
    public void build() {
        createKnight("sir Colder",57 );
        createKnight("sir McGregor",31 );
        createKnight("sir Emmentaler",17 );
    }

    @Override
    public String toString() {
        return "KnightRepository{" +
                "knights=" + knights +
                '}';
    }
}
