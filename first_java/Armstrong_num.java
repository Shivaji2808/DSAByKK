package first_java;

import java.util.Scanner;

public class Armstrong_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter a number: ");
//        int num = sc.nextInt();
//        System.out.println(isArmstrong(num));
        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i))
                System.out.println(i + " is an Armstrong Number");
        }

    }

    static boolean isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        while(num>0){
            int rem = num % 10;
            num /= 10;
            sum = sum + rem*rem*rem;
        }
        return sum == temp;
    }

}
