package conditionals_loops;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.print("Enter another number: ");
        int num2 = sc.nextInt();
        TwoSum b1 = new TwoSum();
        int sum = b1.sum(num, num2);
        System.out.println("The Sum is " + sum);
    }

    int sum(int num, int num2) {
        int sum = num + num2;
        return sum;
    }
}
