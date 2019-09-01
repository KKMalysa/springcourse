package pl.karolmalysa.springcourse.domain;

import org.junit.Assert;
import org.junit.Test;

public class CastleTest {

    @Test
    public void castleToStringMessage(){
        Quest quest = new Quest();          // tworzymy nowe zadanie operatorem new
        Knight knight = new Knight(); //tworzymy rycerza
        knight.setQuest(quest);             // wywołujemy metode wstrzykującą questa z utworzonym przez nas zadaniem
        Castle castle = new Castle(knight, "Fair Heaven");
        String expect = "   Oto zamek o nazwie Fair Heaven, w którym mieszka Rycerz Skrzetuski (57 lat). Jego zadanie to:Zabij smoka i uratuj księżniczkę";
        Assert.assertEquals(expect, castle.toString());
    }
}
