package Conditional_loops_Intermediate;

import java.util.Scanner;

public class PowerInJava {
    void Pjava(double num, double power){
        double pResult = Math.pow(num,power);
        System.out.println("The Result: " + pResult);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter the power: ");
        int power = sc.nextInt();
        PowerInJava obj = new PowerInJava();
        obj.Pjava(num, power);
    }
}
