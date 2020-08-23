package project1;

public class Hero {
    public static int heroesCount = 0;

    private String name = "Maniek";
    private String gender = "Mężczyzna";
    private int hp = 100;
    private int st = 10;

    public Hero() {
        heroesCount++;
        System.out.println("Wywołanie konstruktora " + heroesCount);
    }

    public void printStats() {
        System.out.println("Statystki Postaci: " + name + "\nPłeć: " + gender + "\nZdrowie: " + hp + "\nSiła: " + st);
    }

    public void setName(String name) {
        this.name = name;
    }
}

// static zamyka cos w classie zamiast w instancji
