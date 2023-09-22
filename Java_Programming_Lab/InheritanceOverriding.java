package Java_Programming_Lab;

import java.awt.*;
import java.sql.SQLOutput;

class Geometry{
    int x,y;
    boolean filled;
    Geometry(int x, int y, boolean filled){
        this.x = x;
        this.y = y;
        this.filled = filled;
    }
    void print(){
        System.out.println("X: "+x+",   Y: "+y+",   Filled: " + filled);
    }
}
class Circle extends Geometry{
    int radius;
    float area;
    Circle(int x, int y, Boolean filled, int radius){
        super(x,y,filled);
        this.radius=radius;
    }
    void area(){
        area = (float) (3.14*radius*radius);
    }
    void print(){
        super.print();
        System.out.println("Area of Circle: " + area);
    }

}
class Rectangle extends Circle{
    int l,b;
    int area;
    Rectangle(int x, int y, boolean filled, int radius, int l, int b){
        super(x,y,filled,radius);
        this.l = l;
        this.b = b;
    }
    void area(){
        super.area();
        area = l*b;
    }
    void print(){
        super.print();
        System.out.println();
        System.out.println("L: "+l+" B: "+b);
        System.out.println("Area of Rectangle: "+area);
    }
}
public class InheritanceOverriding {
    public static void main(String[] args) {
        Geometry g1 = new Geometry(2,3,false);
        Circle c1 = new Circle(6,4,true,7);
        Rectangle r1 = new Rectangle(10,3,true,9,5,10);
        System.out.println("Details of Geometry Class");
        g1.print();
        System.out.println();
        System.out.println("Details of Circle Class");
        c1.area();
        c1.print();
        System.out.println();
        System.out.println("Details of Rectangle Class");
        r1.area();
        r1.print();

    }

}
