package project1;

import java.util.Random;

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
// TODO: applyDmg + buffs

    // zadawanie obrazen

//    public void applyDamage(DMG dmg) {
//        health = 0;
//
//
//    }

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
    // Taunt

    public void getTaunt() {
        Random random = new Random();
        int value = random.nextInt(4);

        switch (value) {
            case 0: {
                System.out.println("Obelga 1");
            }
            break;
            case 1: {
                System.out.println("Obelga 2");
            }
            break;
            case 2: {
                System.out.println("Obelga 3");
            }
            break;
            case 3: {
                System.out.println("Obelga 4");
            }
            break;
            default:
                System.out.println("[UNEXPECTED ERROR]");

        }
    }
}