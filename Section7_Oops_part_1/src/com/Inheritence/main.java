package com.Inheritence;
// what is inheritance and why it is so powerful
// used for code re-usability
// for example animal class in the animal kingdom
public class main {
    public static void main(String[] args) {
        Animal animal = new Animal("generic animal","huge","400");
        doAnimal(animal,"slow");
        Dog dog = new Dog();
        doAnimal(dog,"fast");
        Cat cat = new Cat();
        doAnimal(cat,"fast");
        Dog dog2 = new Dog("yorkie","34","56","circle","wagged");
    }
    public static void doAnimal(Animal animal ,String speed){
        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println(" - - - - - - - - ");
    }
}
