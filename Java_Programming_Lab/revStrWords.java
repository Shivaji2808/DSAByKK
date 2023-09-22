package Java_Programming_Lab;

import java.util.Scanner;

public class revStrWords {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String str1, str2="", s="";
        System.out.print("Enter a string: ");
        str1 = in.nextLine();
        str1 += " ";
        for(int i=0;i<str1.length();i++) {
            char c = str1.charAt(i);
            if(c!=' ')
                s = c + s;
            else {
                str2 += s + " ";
                s="";
            }
        }
        System.out.println("Input String: " + str1);
        System.out.println("Output String: " + str2);
    }
}
