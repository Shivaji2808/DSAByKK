package conditionals_loops;

import java.util.Scanner;

public class AreaOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("");
            System.out.println("_____Area Calculator Home Menu_____");
            System.out.println("1: Area of Circle");
            System.out.println("2: Area of Triangle");
            System.out.println("3: Area of Rectangle");
            System.out.println("4: Area of Isosceles Triangle");
            System.out.println("5: Area of Parallelogram");
            System.out.println("6: Area of Rhombus");
            System.out.println("7: Area of Equilateral Triangle");
            System.out.println("");

            System.out.print("Enter the shape number to calculate the area: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> circle();
                case 2 -> triangle();
                case 3 -> rectangle();
                case 4 -> isosceles();
                case 5 -> parallelogram();
                case 6 -> rhombus();
                case 7 -> equilateral();
                default -> System.out.println("Enter the correct choice: ");
            }
            if(choice == 0)
                break;
        }
    }
    static void equilateral () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        double area = 0.4325*side*side;
        System.out.println("Area of Equilateral Triangle: " + area);
    }

    static void rhombus () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first diagonal: ");
        int d1 = sc.nextInt();
        System.out.print("Enter the second diagonal: ");
        int d2 = sc.nextInt();
        double area = 0.5*(d1*d2);
        System.out.println("Area of Rhombus: " + area);
    }

    static void parallelogram () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        double area = base*height;
        System.out.println("Area of Parallelogram: " + area);
    }

    static void isosceles () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        double area = 0.5*(base*height);
        System.out.println("Area of Isosceles Triangle: " + area);
    }

    static void rectangle () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        double area = length*breadth;
        System.out.println("Area of Rectangle: " + area);
    }

    static void triangle () {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base: ");
        int base = sc.nextInt();
        System.out.print("Enter the height: ");
        int height = sc.nextInt();
        double area = 0.5*(base*height);
        System.out.println("Area of Triangle: " + area);
    }

    static void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        double area = 3.14 * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}



