package oops;

public class Animal {

    String name;
    String sound;

    public void makeSound() {
        System.out.println(name + " says " + sound);
    }

    public static void main(String[] args) {
        Animal dog = new Animal();
        dog.name = "Dog";
        dog.sound = "Woof";

        Animal cat = new Animal();
        cat.name = "Cat";
        cat.sound = "Meow";

        dog.makeSound();
        cat.makeSound();
    }
}