package Java_Programming_Lab;

import java.util.Scanner;

public class divByThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a limit: ");
        int limit = sc.nextInt();
        int []arr = new int[limit];
        System.out.println("Enter "+limit+" elements in array: ");
        for(int i = 0;i<limit;i++){
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for(int x: arr){
            if(x%3==0) count++;
        }
        System.out.println("The count of numbers divisible by 3 is "+count);

    }
}
