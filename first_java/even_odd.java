package first_java;

import java.util.Scanner;

public class even_odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        check(num);
    }
    static void check(int a){
        System.out.println(a%2==0?"Even":"Odd");
    }
}
