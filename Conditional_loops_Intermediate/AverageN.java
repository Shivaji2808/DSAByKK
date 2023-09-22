package Conditional_loops_Intermediate;

import java.util.Scanner;

public class AverageN {
    public static void main(String[] args) {
        AverageN obj = new AverageN();
        obj.average();
    }
    void average(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();
        int avgSum = 0;
        System.out.println("Enter the numbers to calculate the average: ");
        for (int i = 0; i < limit; i++) {

            avgSum = avgSum + sc.nextInt();
        }
        float average = (float) avgSum /limit;
        System.out.println("Average: " + average);
    }
}
