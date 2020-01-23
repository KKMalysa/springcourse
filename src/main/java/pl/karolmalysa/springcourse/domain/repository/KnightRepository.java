package pl.karolmalysa.springcourse.domain.repository;

import pl.karolmalysa.springcourse.domain.Knight;

import java.util.Collection;
import java.util.Optional;

public interface KnightRepository {

    void createKnight(String name, int age);

    void createKnight(Knight knight);

    Collection<Knight> getAllKnights();

    Optional<Knight> getKnight(String name);

    void deleteKnight(Integer id);

    void build();

    @Override
    String toString();

    Knight getKnightById(Integer id);
}
