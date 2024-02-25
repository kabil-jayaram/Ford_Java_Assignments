package Abstract_Class.Question3;

abstract class Animal {
    String name;
    int age;

    abstract void makeSound();
}

class Lion extends Animal {
    public Lion(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Roar");
    }
}

class Elephant extends Animal {
    public Elephant(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void makeSound() {
        System.out.println("Trumpet");
    }
}

public class Main {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba",5);
        lion.makeSound();

        Elephant elephant = new Elephant("Dumbo", 10);
        elephant.makeSound();
    }
}
