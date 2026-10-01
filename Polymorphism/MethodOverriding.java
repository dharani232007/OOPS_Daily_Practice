class Animal {
    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    void sound() {
        System.out.println("Meow");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound(); // Outputs: Bark
        
        a = new Cat();
        a.sound(); // Outputs: Meow
    }
}
