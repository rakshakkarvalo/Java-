class Animal {
    void sound() {
        System.out.println("The animal makes a sound.");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("The Cat meows");
    }
}

class Dog extends Cat {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class AnimalMain {
    public static void main(String[] args) {

        Animal a = new Animal();
        a.sound();

        Cat c = new Cat();
        c.sound();

        Dog d = new Dog();
        d.sound();
    }
}
