package first_java;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter the operator from +,-,*,/,%: ");
        char op = sc.next().trim().charAt(0);
        calc(a,b,op);
    }

    static int calc(int a, int b, char op ) {
        int result;
        while (true) {
            result = 0;
            if (op == '+') {
                result = a + b;
                System.out.println("Sum: " + result);
                break;
            }
            if (op == '-') {
                result = a - b;
                System.out.println("Difference: " + result);
                break;
            }
            if (op == '*') {
                result = a * b;
                System.out.println("Product: " + result);
                break;
            }
            if (op == '/') {
                if (b != 0) {
                    result = a / b;
                    System.out.println("Division: " + result);
                    break;
                }
            }
            if (op == '%') {
                result = a % b;
                System.out.println("Modulus: " + result);
                break;
            }
            if (op == 'x' || op == 'X') {
                System.out.println("Thanks for using !!!");
            }
            else {
                System.out.println("Enter the correct operator!!!");
            }
            break;

        }
        return result;
    }
}
