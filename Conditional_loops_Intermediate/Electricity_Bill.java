package Conditional_loops_Intermediate;
import java.util.Scanner;
public class Electricity_Bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of units consumed: ");
        int unit = sc.nextInt();
        bill(unit);
    }

    static void bill(int unit){
        int bill = 1;
        bill = unit * 8;
        System.out.println("Your Electricity bill is " + bill);
    }
}
