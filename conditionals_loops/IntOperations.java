package conditionals_loops;

import java.util.Scanner;

public class IntOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result = mul(num) - sum(num);
        System.out.println("Result: " + result);
    }

    static int sum(int num){
        int sum = 0;
        while(num != 0){
            int rem = num % 10;
            sum = sum + rem;
            num/=10;

        }
        return sum;
    }

    static int mul(int num){
        int mul = 1;
        while(num != 0) {
            int rem = num % 10;
            mul = mul*rem;
            num/=10;
        }
        return mul;
    }
}
