package Java_Programming_Lab;
import java.io.*;
public class ExceptionDemo1 {
    public static void main(String[] args) {
        int []a = new int[2];
        try{
            System.out.println("Accessing 3rd index element: "+a[3]);
            System.out.println("After Accessing Array!!");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception thrown: "+e);
        }
        finally {
            a[0]=6;
            a[1]=7;
            System.out.println("a[0]= "+a[0]+"\na[1]= "+a[1]);
        }
    }
}
