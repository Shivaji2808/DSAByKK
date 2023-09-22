package Java_Programming_Lab;

import java.util.Scanner;

public class divBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.println("Enter the "+i+"th number: ");
            arr[i] = sc.nextInt();
        }
        System.out.println();
        System.out.println("Elements divisible by 3 are: ");
        for (int x:arr) {
            if(x%3==0) System.out.println(x);
        }
    }
}
