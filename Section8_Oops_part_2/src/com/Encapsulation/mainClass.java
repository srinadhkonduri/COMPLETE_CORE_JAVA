package com.Encapsulation;

public class mainClass {
//    creating three subclasses in the main  class
public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "tim";
//        player.health = 20;
//        player.weapon = "sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("remaining health is = "
//                + player.remainingHealth());
////        player.health = 200;
//        player.loseHealth(11);
//    System.out.println("remaining health = " + player.remainingHealth());
    EnhancedPlayer nani = new EnhancedPlayer("nani",200,"sword");
    System.out.println("initial health is = " +nani.remainingHealth());
    }
}
