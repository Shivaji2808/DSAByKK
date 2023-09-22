package conditionals_loops;

import java.util.Scanner;

public class PerimeterOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("");
            System.out.println("_____Perimeter Calculator Home Menu_____");
            System.out.println("1: Perimeter of Circle");
            System.out.println("2: Perimeter of Equilateral Triangle");
            System.out.println("3: Perimeter of Parallelogram");
            System.out.println("4: Perimeter of Rectangle");
            System.out.println("5: Perimeter of Square");
            System.out.println("6: Perimeter of Rhombus");
            System.out.println("");

            System.out.print("Enter the shape number to calculate the Perimeter: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> circle();
                case 2 -> equilateral();
                case 3 -> parallelogram();
                case 4 -> rectangle();
                case 5 -> square();
                case 6 -> rhombus();
                default -> System.out.println("Enter the correct choice: ");
            }
            if(choice == 0)
                break;
        }
    }

    private static void square() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        double perimeter = 4*side;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
    }

    static void equilateral() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        double perimeter = 3*side;
        System.out.println("Perimeter of Equilateral Triangle: " + perimeter);
    }
    static void rhombus() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side: ");
        int side = sc.nextInt();
        double perimeter = 4*side;
        System.out.println("Perimeter of Rhombus: " + perimeter);
    }

    static void parallelogram() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        double perimeter = 2*(a+b);
        System.out.println("Perimeter of Parallelogram: " + perimeter);
    }

    static void rectangle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length: ");
        int length = sc.nextInt();
        System.out.print("Enter width: ");
        int width = sc.nextInt();
        double perimeter = 2*(length+width);
        System.out.println("Perimeter of rectangle: " + perimeter);
    }

    static void circle() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        int radius = sc.nextInt();
        double perimeter = 2*3.14*radius;
        System.out.println("Perimeter of Circle: " + perimeter);
    }
}

