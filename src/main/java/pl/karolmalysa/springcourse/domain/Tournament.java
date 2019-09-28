package pl.karolmalysa.springcourse.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

@Component
public class Tournament {
    @Autowired //  @Qualifier(value="Garen") trzeba usunąć, bo w tym momencie jest nielogiczny.
    List<Knight> knights;  // z deklaracji rycerza, robimy deklarację listy rycerzy

    public void setKnights(List<Knight> knights) { //odpowiednio należy przerobić setter
        this.knights = knights;
    }

    public Tournament(){

    }

    public void duel(){
//        knight.setAge(knight.getAge()+1); //ten get jest tutaj dlatego, że (ustawia wiek rycerza na: (pobiera wiek rycerza i zwiększa go o 1))
    }

    @Override
    public String toString() {
        return "W turnieju udział biorą bohaterowie naszego królestwa! "
                + knights.stream().map(Objects::toString).collect(Collectors.joining(","));
    }

}
