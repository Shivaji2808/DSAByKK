package Java_Programming_Lab;

import java.util.Scanner;

class Volume{
    int height,width,depth;
    float volume;
    double biggest,smallest;
    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter height: ");
        height = sc.nextInt();
        System.out.print("Enter width: ");
        width = sc.nextInt();
        System.out.print("Enter depth: ");
        depth = sc.nextInt();
    }
    void findVolume(){
        volume = height*depth*width;
    }
    void valDetPrint(){
        System.out.println();
        System.out.println("Height: "+height);
        System.out.println("Width: "+width);
        System.out.println("Depth: "+depth);
        System.out.println("Volume: "+volume);
        System.out.println();
    }


}
public class boxVolume {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Volume []obj = new Volume[n];
        for(int i = 0;i<n;i++){
            obj[i] = new Volume();
            System.out.println("Details of "+i+"th object");
            obj[i].input();
            obj[i].findVolume();
            obj[i].valDetPrint();
            System.out.println();
        }
    }
}
