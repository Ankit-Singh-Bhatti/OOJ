import java.util.Scanner;
import java.lang.Math;
abstract class Shape{
    abstract void calculateArea();
    abstract void calculatePerimeter();
    Scanner in=new Scanner(System.in);
}
class Circle extends Shape{
    Circle(){
        System.out.println("Circle object created");
    }
    void calculateArea(){
        double area,radius;
        System.out.println("enter the circle radius:");
        radius=in.nextDouble();
        area=(Math.PI*radius*radius);
        System.out.println("The Area of the cirlce is:"+area);
    }
    void calculatePerimeter(){
        double peri,radius;
        System.out.println("enter the circle radius:");
        radius=in.nextDouble();
        peri=(2*Math.PI*radius);
        System.out.println("The Perimeter of the cirlce is:"+peri);
    }
}
class Triangle extends Shape{
    Triangle(){
        System.out.println("Triangular object created");
    }
    void calculateArea(){
        double area;
        double a,b,c;
        System.out.println("enter the side A of the triangle:");
        a=in.nextDouble();
        System.out.println("enter the side B of the triangle:");
        b=in.nextDouble();
        System.out.println("enter the side C of the triangle:");
        c=in.nextDouble();
        double s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The Area of the Triangle is:"+area);
    }
    void calculatePerimeter(){
        double peri;
        double a,b,c;
        System.out.println("enter the side A of the triangle:");
        a=in.nextDouble();
        System.out.println("enter the side B of the triangle:");
        b=in.nextDouble();
        System.out.println("enter the side C of the triangle:");
        c=in.nextDouble();
        peri=(a+b+c);
        System.out.println("The Perimeter of the Triangle is:"+peri);
    }
}
class abstractlast{
    public static void main(String args[]){
        Circle obj1= new Circle();
        obj1.calculateArea();
        obj1.calculatePerimeter();
        Triangle obj2= new Triangle();
        obj2.calculateArea();
        obj2.calculatePerimeter();
    }
}