package first_java;

import java.util.Scanner;

public class withoutLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        withoutLoop obj = new withoutLoop();
        obj.wNum(num);
    }
    public void wNum(int N){
        if(N==0) return;
        wNum(N-1);
        System.out.print(N+" ");
    }
}
