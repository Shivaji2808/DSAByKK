package Conditional_loops_Intermediate;

import java.util.Scanner;

public class Commission_Percentage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the sale price: ");
        int sale_price = sc.nextInt();
        System.out.print("Enter the Commission percentage: ");
        int commission_percentage = sc.nextInt();
        Commission_Percentage obj = new Commission_Percentage();
        obj.CPercentage(sale_price, commission_percentage);
    }

    void CPercentage(int sale_price, int commission_percentage){
        double commission_amount = sale_price * ((double) commission_percentage /100);
        System.out.println("Commission Amount: " + commission_amount);
    }
}
