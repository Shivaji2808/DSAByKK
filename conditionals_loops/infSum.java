package conditionals_loops;

import java.util.Scanner;

public class infSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while(true){
            System.out.print("Enter a number or 0 to quit: ");
            int num = sc.nextInt();
            if (num == 0){
                break;
            }
            else
                sum = sum + num;
        }
        System.out.println("The Sum of all the input numbers is : " + sum);
    }
}
