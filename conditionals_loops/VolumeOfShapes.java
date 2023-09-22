package conditionals_loops;

import java.util.Scanner;

public class VolumeOfShapes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("");
            System.out.println("_____Mensuration Calculator Home Menu_____");
            System.out.println("1: Volume of Cone");
            System.out.println("2: Volume of Prism");
            System.out.println("3: Volume of Cylinder");
            System.out.println("4: Volume of Sphere");
            System.out.println("5: Volume of Pyramid");
            System.out.println("6: Curved Surface Area of Cylinder");
            System.out.println("7: Total Surface Area of Cube");

            System.out.print("Enter the shape number to calculate the Perimeter: ");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> cone();
                case 2 -> prism();
                case 3 -> cylinder();
                case 4 -> sphere();
                case 5 -> pyramid();
                case 6 -> csCylinder();
                case 7 -> tsCube();
                default -> System.out.println("Enter the correct choice: ");
            }
            if (choice == 0)
                break;
        }
    }

        static void cone () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            int radius = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();
            double volume = 0.33333*(3.14*radius*radius*height);
            System.out.println("Volume of Cone: " + volume);
        }

        static void prism () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base: ");
            int base = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();
            double volume = base*height;
            System.out.println("Volume of prism: " + volume);
        }

        static void cylinder () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            int radius = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();
            double volume = 3.14159*radius*radius*height;
            System.out.println("Volume of Cylinder: " + volume);
        }

        static void sphere () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            int radius = sc.nextInt();
            double volume = 1.33333*(3.14159*radius*radius*radius);
            System.out.println("Volume of Sphere: " + volume);
        }

        static void pyramid () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the base length: ");
            int blength = sc.nextInt();
            System.out.print("Enter the base width: ");
            int bwidth = sc.nextInt();
            System.out.print("Enter the pyramid height: ");
            int pheight = sc.nextInt();
            double volume = (blength*bwidth*pheight)/3;
            System.out.println("Volume of Pyramid: " + volume);
        }

        static void csCylinder () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the radius: ");
            int radius = sc.nextInt();
            System.out.print("Enter the height: ");
            int height = sc.nextInt();
            double cSurface = 2*3.14159*radius*height;
            System.out.println("Curved Surface Area of Cylinder: " + cSurface);
        }

        static void tsCube () {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the side: ");
            int side = sc.nextInt();
            double tSurface = 6*side*side;
            System.out.println("Total Surface Area of Sphere: " + tSurface);
        }
}