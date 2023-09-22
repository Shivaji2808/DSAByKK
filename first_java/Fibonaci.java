package first_java;

import java.util.Scanner;
public class Fibonaci {
    public static void main(String[] args) {
        series();
    }

    static void series(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the limit: ");
        int range = sc.nextInt();
        int a = 0;
        int b = 1;
        int series = 0;
        System.out.print("Series: " + a +" "+ b);
        for(int i = 0;i<range;i++){
            series = a+b;
            a=b;
            b=series;
            System.out.print(" " + series);
        }
    }
}

