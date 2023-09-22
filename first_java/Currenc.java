package first_java;

import java.util.Scanner;

public class Currenc {
    public static void main(String[] args) {
        System.out.println("Currency after Conversion: " + convert());
    }

    static double convert(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter currency in INR: ");
        double inr = sc.nextInt();
        double usd = inr/81.97;
        return usd;
    }
}

