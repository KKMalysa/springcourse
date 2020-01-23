package pl.karolmalysa.springcourse.domain.repository;

import pl.karolmalysa.springcourse.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.Optional;

public class DBKnightRepository implements KnightRepository {

    @Override
    public void createKnight(String name, int age) {
        System.out.println("używam Bazy Danych :D ");

    }

    @Override
    public Collection<Knight> getAllKnights(){
        System.out.println("używam Bazy Danych :D ");
        return null;
    }

    @Override
    public Optional<Knight> getKnight(String name){
        System.out.println("używam Bazy Danych :D ");
        return null;
    }

    @Override
    public void deleteKnight(Integer id){
        System.out.println("używam Bazy Danych :D ");
    }

    @Override
    @PostConstruct
    public void build() {

    }

    @Override
    public void createKnight(Knight knight) {
        System.out.println("używam Bazy Danych :D ");
    }

    @Override
    public Knight getKnightById(Integer id) {
        System.out.println("używam Bazy Danych :D ");
        return null;
    }
}
