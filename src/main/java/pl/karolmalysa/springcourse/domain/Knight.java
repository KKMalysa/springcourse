package pl.karolmalysa.springcourse.domain;

public class Knight {

    private String name;
    private int age;

    private Quest quest;

    public Knight(String name, int age, Quest quest) {
        this.name=name;
        this.age=age;
        this.quest= quest;
    }

    /**WSTRZYKIWANIE ZALEŻNOŚCI PRZEZ METODĘ
     *
     * Od wstrzykiwania przez konstruktor różni się tym, że zamiast podawać questa w konstruktorze,
     * tworzy się dla niego specjalnie seter. sądzę jednak, że metoda przez KONSTRUKTOR jest częściej stosowana
     */
    public Knight(String name, int age) {
        this.name=name;
        this.age=age;
    }
    public void setQuest(Quest quest) {
        this.quest= quest;
    }


    @Override
    public String toString() {
        return "Rycerz " + name + " (" + age +" lat). Aktualna misja: " + quest;
    }
}
