package first_java;

import java.util.Scanner;

public class Greet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println(greeting(name));
    }
    static String greeting(String name){
        return ("Hello " + name);
    }
}
