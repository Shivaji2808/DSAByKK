package Conditional_loops_Intermediate;

import java.util.Scanner;

public class SwitchCase {
     static int swtch(int num) {
         switch (num) {
             case 1 -> {
                 return 1;
             }
             case 2 -> {
                 return 2;
             }
         }
         return num;
     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(swtch(num));
    }
}


