package Java_Programming_Lab;

import java.util.Scanner;

public class minMaxArr {
    void inputArr(int []arr){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter elements in Array: ");
        for(int i = 0;i< arr.length;i++){
            arr[i] = sc.nextInt();
        }
    }
    void minMax(int []arr){
        int min = arr[0];
        int max = arr[0];
        System.out.println();
        System.out.print("Array Elements: ");
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
            if(min>arr[i]) min = arr[i];
            if(max<arr[i]) max = arr[i];
        }
        System.out.println();
        System.out.println();
        System.out.println("Maximum Value: "+max);
        System.out.println("Minimum Value:" + min);
    }
    public static void main(String[] args) {
        minMaxArr obj = new minMaxArr();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        int []arr = new int[n];
        obj.inputArr(arr);
        obj.minMax(arr);

    }
}
