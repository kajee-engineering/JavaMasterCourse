package Section7_OOP_Part1_Inheritance.Inheritance.src;

import Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog;

public class Main {

    public static void main(String[] args) {
        Animal animal = new Animal("Generic Animal", "Huge", 400);
        doAnimalStuff(animal, "slow");

        Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog dog = new Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog();
        doAnimalStuff(dog, "fast");

        Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog yorkie = new Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog("Yorkie", 15);
        doAnimalStuff(yorkie, "fast");

        Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog retriever = new Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog("Labrador Retriever", 65,
                "Floppy", "Swimmer");
        doAnimalStuff(retriever, "slow");

        Section7_OOP_Part1_Inheritance.StaticVariables.src.Dog wolf = new Dog("Wolf", 40);
        doAnimalStuff(wolf, "slow");

        Fish goldie = new Fish("Goldfish", 0.25, 2, 3 );
        doAnimalStuff(goldie, "fast");
    }

    public static void doAnimalStuff(Animal animal, String speed) {

        animal.makeNoise();
        animal.move(speed);
        System.out.println(animal);
        System.out.println("_ _ _ _");
    }
}