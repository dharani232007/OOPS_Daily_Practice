package Abstraction;

abstract class Shape{
    void area(){

    }

   
}

class Circle extends Shape{
    int radius;

    Circle(int r){
        this.radius = r;
    }
    void area(){
        System.out.println("Circle area is: " + (3.14)*radius*radius);
    }
}

class Rectangle extends Shape{
    int length;
    int breadth;

    Rectangle(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }
    void area(){
        System.out.println("Recatangle area for "+ length + " and " + breadth+" is " + length*breadth);
    }
}



public class ShapeDemo {
    public static void main(String[] args){

        Circle c1 = new Circle(5);
        c1.area();

        Rectangle r1 = new Rectangle(3,7);
        r1.area();


    }

    

    
}
