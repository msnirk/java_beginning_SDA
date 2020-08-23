package project1;

public class Monster {

    private String name = "Orc Lord";
    private double health = 50;
    private double stgh = 7;
    private double damage = stgh * 0.65;
    private int defence = 4;
    private int loot = 15;
    private String clan = "Orgrimmar";
    private double speed = 15;
    private int mana = 20;
    private double buff = 1.5;

    public void printStats() {
        System.out.println("Monster " + name + " from clan " + clan + " has appeared in front of you!");
        System.out.println("He have " + health + " HP, " + stgh + " strength, " + mana + " mana.");
        System.out.println("Watch out, when his HP goes down by 75% he uses taunt to buff his stats by 50%!");
    }
// pozostale zycie

    private void printHp() {
        System.out.println("He have " + health + " left.");
    }
// zadawanie obrazen

    public void applyDamage(Hero dmg) {
        health = 0;


    }

// zaladowanie buff'a

    public void buffs() {
        if (health <= health * 0.75) {
            health %= health * buff;
            speed = speed * buff;
            stgh = stgh * buff;
            System.out.println("UGGGHHHHAAAA!");
            printHp();
        } else
            printHp();
    }
}
