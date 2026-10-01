package Inheritance;

public class SingleInheritance {

    static class Animal{

        void eat(){
            System.out.println("Animals are eating");
        }
    }

    static class Dog extends Animal{

        void bark(){
            System.out.println("Dog is barking");
        }
    }
    
    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.eat();
        Dog d1 = new Dog();
        d1.bark();
        d1.eat();
    }
}
