package Java_Programming_Lab;

import java.util.Scanner;

public class throwDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr = {1,2,3,4,5,6,7,8,9};
        int n = sc.nextInt();
        try{
            if(n<3 || n>6) {
                throw new ArrayIndexOutOfBoundsException("Index not in limit");
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Expetion Caught: "+e);
        }
    }
}
