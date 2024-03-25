package com.Encapsulation;

public class EnhancedPlayer {
//    here in enhanced player we are creating the fields
//    as constructors
    private String fullName;
    private int healthPercentage;
    private String weapon;

    public EnhancedPlayer(String fullName) {
        this(fullName,100,"sword");
    }

    public EnhancedPlayer(String fullName, int health, String weapon) {
        this.fullName = fullName;
//        here I am personally accessing the health field to be controlling
//        this.health = health;
        if (health <= 0){
            this.healthPercentage = 1;
        } else if(health > 100){
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = health;
        }
        this.weapon = weapon;
    }
    public void loseHealth(int damage){
        healthPercentage = healthPercentage - damage;
        if (healthPercentage <= 0){
            System.out.println("player knocked");
        }
    }

    //    in the second method we created the remaining health method
    public int remainingHealth(){
        return healthPercentage;
    }

    //    in the third method we created the restore health method
    public void restoreHealth(int extraHealth){

        healthPercentage = healthPercentage + extraHealth;
        if (healthPercentage > 100){
            System.out.println("player restored health");
            healthPercentage = 100;
        }
    }
}
