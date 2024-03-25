package com.Encapsulation;

public class Player {
//    here we used the access modifier public
//    the reason we have used the access  modifiers to the public
//    because we can use it anywhere throughout the whole code
    public String name;
    public int health;
    public String weapon;

    //    creating some methods in the class
//    in the first method we created the health method
    public void loseHealth(int damage){
        health = health - damage;
        if (health <= 0){
            System.out.println("player knocked");
        }
    }

    //    in the second method we created the remaining health method
    public int remainingHealth(){
        return health;
    }

    //    in the third method we created the restore health method
    public void restoreHealth(int extraHealth){

        health = health + extraHealth;
        if (health > 100){
            System.out.println("player restored health");
            health = 100;
        }

    }
}
