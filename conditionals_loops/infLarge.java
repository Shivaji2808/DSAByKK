package conditionals_loops;

import java.util.Scanner;

public class infLarge {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int largest = 0;
        while(true){
            System.out.print("Enter a number or 0 to quit: ");
            int num = sc.nextInt();
            if(num > largest)
                largest = num;
            else if(num == 0){
                break;
            }
        }
        System.out.println("The Largest among all the numbers is : " + largest);
    }
}
