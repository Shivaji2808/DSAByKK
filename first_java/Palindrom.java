package first_java;

import java.util.Scanner;

public class Palindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String: ");
        String str = sc.nextLine();
        check(str);
    }

    static void check(String str){
        String rev = "";
        int strLength = str.length();
        for (int i = (strLength - 1); i >=0; --i) {
            rev = rev + str.charAt(i);
        }
        if (str.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println(str + " is a Palindrome String.");
        }
        else {
            System.out.println(str + " is not a Palindrome String.");
        }
    }

}
