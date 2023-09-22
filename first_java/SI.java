package first_java;

import java.util.Scanner;

public class SI {
    public static void main(String[] args) {
        System.out.println("SI: "+si());
    }
    public static double si(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        int p= sc.nextInt();
        System.out.print("Enter Rate: ");
        float r= sc.nextInt();
        System.out.print("Enter Time in Years: ");
        int t= sc.nextInt();
        double si = (p*r*t)/100;
        return si;
    }
}
