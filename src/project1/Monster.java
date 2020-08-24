package project1;

import java.util.Random;

public class Monster {

    private String name = "Orc Lord";
    private double health = 50;
    private double stgh = 7;
    private double damage = stgh * 0.65;
    private int defence = 4;
    private int loot = 15;
    private String clan = "Ogrimmar";
    private double speed = 15;
    private double mana = 20;
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

//     zadawanie obrazen

    public void applyDamage() {
        health -= 10;
        System.out.println("You've deal 10 dmg to Orc Lord");
        if (health <= 0) {
            System.out.println("Orc Lord is dead");
        }
        if (health > 0) {
            printHp();
            buffs();
            getTaunt();

        }

    }

// zaladowanie buff'a

    private void buffs() {
        if (health < 15) {
            health = health * buff;
            speed = speed * buff;
            stgh = stgh * buff;
            System.out.println("UGGGHHHHAAAA!");
            shortStats();
        }

    }

    // short stats
    private void shortStats() {
        System.out.println("Orc Lord now have " + health + " HP " + stgh + " strength and " + speed + "speed.");
    }
    // Taunt

    private void getTaunt() {
        Random random = new Random();
        int value = random.nextInt(5);

        switch (value) {
            case 0: {
                System.out.println("Never gonna give you up");
            }
            break;
            case 1: {
                System.out.println("Never gonna let you down");
            }
            break;
            case 2: {
                System.out.println("Never gonna run around and desert you");
            }
            break;
            case 3: {
                System.out.println("Never gonna make you cry");
            }
            break;
            case 4: {
                System.out.println("Never gonna say goodbye");
            }
            break;
            default:
                System.out.println("Never gonna tell a lie and hurt you");

        }
    }
}