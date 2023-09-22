package first_java;

import java.util.Scanner;

public class PrimeNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println(prime(num));
    }
    static boolean prime(int num){
        int c = 2;
        if(num <= 1)
            return false;
        while(c*c <= num){
            if(num % c == 0) {
                return false;
            }
            c++;
        }
        return c*c > num ;
    }
}
