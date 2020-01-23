package pl.karolmalysa.springcourse.domain.repository;

import pl.karolmalysa.springcourse.domain.Knight;

import javax.annotation.PostConstruct;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;


public class InMemoryRepository implements KnightRepository {

    Map<Integer, Knight> knights = new HashMap<>();

    public InMemoryRepository() {

    }

    @Override
    public void createKnight(String name, int age){

        Knight newKnight = new Knight(name, age);
        newKnight.setId(getNewId());
        knights.put(newKnight.getId(), newKnight);
    }

    @Override
    public void createKnight(Knight knight) {
        knight.setId(getNewId());
        knights.put(knight.getId(), knight);
    }

    @Override
    public Collection<Knight> getAllKnights(){
        return knights.values();
    }

    @Override
    public Optional<Knight> getKnight(String name){

        Optional<Knight> knightByName = knights.values().stream().filter(knight -> knight.getName().equals(name)).findAny();

        return knightByName;
    }

    @Override
    public void deleteKnight(Integer id){
        knights.remove(id);
    }

    @Override
    @PostConstruct
    public void build() {
        createKnight("sir Colder",57 );
        createKnight("sir McGregor",31 );
        createKnight("sir Emmentaler",17 );
    }


    @Override
    public String toString() {
        return "InMemoryRepository{" +
                "knights=" + knights +
                '}';
    }


    @Override
    public Knight getKnightById(Integer id) {
        System.out.println(id);
        return knights.get(id);
    }

    public int getNewId() {
        if(knights.isEmpty()){
            return 0;
        }
        else {
//            int highest = knights.keySet().stream().max(Integer::max).get();  // to powinno działać

            int highest=0;                  // a tak sobie poradziłem
            for (int i=0; i<knights.size(); i++){
                highest=i;
            }
              return highest+1;
        }
    }
}
