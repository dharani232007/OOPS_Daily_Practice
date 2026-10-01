package Inheritance;

public class MultilevelInheritance {

    static class GrandParent{

        void function(){
           System.out.println("Grand parent class");
        }
    }

    static class Parent extends GrandParent{

        void function(){
            System.out.println("Parent class");
        }

        void callGrandParent(){
            super.function();
        }
    }

    static class Child extends Parent{
        void function(){
            System.out.println("Children class");
        }
    }

    public static void main(String[] args){
        
        GrandParent g1 = new GrandParent();
        g1.function();
        Parent p1 = new Parent();
        p1.function();
        Child c1 = new Child();
        c1.function();
        //upcasting
        //Reference Type (GrandParent)
        //Actual Object Type (Child)
    
        GrandParent g = new Child(); // Runtime POlymorphism or dynamic method dispatch
        g.function();
        //Downcasting ((Parent) g)
        ((Parent) g).callGrandParent();
    }
    
}
