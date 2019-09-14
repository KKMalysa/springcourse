package pl.karolmalysa.springcourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tournament {
    @Autowired
    Knight knight;

    public Tournament(){

    }

    public void duel(){
        knight.setAge(knight.getAge()+1); //ten get jest tutaj dlatego, że (ustawia wiek rycerza na: (pobiera wiek rycerza i zwiększa go o 1))
    }

    @Override
    public String toString() {
        return "W turnieju udział bierze bohater naszego królestwa, sam " + knight+" !! ";
    }
}
