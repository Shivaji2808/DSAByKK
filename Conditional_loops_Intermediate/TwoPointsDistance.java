package Conditional_loops_Intermediate;

import java.util.Scanner;

public class TwoPointsDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the four coordinates x1, x2, y1, and y2 in the respective order:");
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y1 = sc.nextInt();
        int y2 = sc.nextInt();

        TwoPointsDistance obj = new TwoPointsDistance();
        obj.distance(x1,x2,y1,y2);
    }

    void distance(int x1, int x2, int y1, int y2){
        double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
        System.out.println("The distance between two points is " + distance);
    }
}
