import java.lang.Math;
import java.util.Scanner;
abstract class Shape{
    protected int int1,int2;
    abstract void printArea();
    Scanner in=new Scanner(System.in);
}
class Rectangle extends Shape{
    Rectangle(){
        System.out.println("Rectangle object created");
    }
    void printArea(){
    int area;
    System.out.println("Enter the length and breadth of the Rectangle:");
    int1=in.nextInt();
    int2=in.nextInt();
    area=int1*int2;
    System.out.println("Area of the Rectangle:"+area);
}
}
class Triangle extends Shape{
    Triangle(){
        System.out.println("Triangle object created");
    }
    void printArea(){
    double area;
    System.out.println("Enter the base and height of the triangle:");
    int1=in.nextInt();
    int2=in.nextInt();
    area=0.5*int1*int2;
    System.out.println("Area of the triangle:"+area);
}
}
class Circle extends Shape{
    Circle(){
        System.out.println("Circle object created");
    }
    void printArea(){
    double area;
    System.out.println("Enter the Radius of the Circle:");
    int1=in.nextInt();
    area=Math.PI*int1*int1;
    System.out.println("Area of the triangle:"+area);
}
}
class lab4{
    public static void main(String[] args) {
        Rectangle obj1=new Rectangle();
        obj1.printArea();
        Triangle obj2=new Triangle();
        obj2.printArea();
        Circle obj3=new Circle();
        obj3.printArea();
    }
}