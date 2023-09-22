package first_java;

import java.util.Scanner;

public class Largest_num {
    public static void main(String[] args) {
        large();
    }
    static void large(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        if(a>b)
            System.out.println(a + " is Largest");
        else
            System.out.println(b + " is largest");
    }
}
