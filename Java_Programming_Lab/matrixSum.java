package Java_Programming_Lab;

import java.sql.SQLOutput;
import java.util.Scanner;

public class matrixSum {
    public void printMat(int [][]ar1, int [][]ar2, int r, int c){
        System.out.println("The first matrix: ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(ar1[i][j]+"  ");
            }
            System.out.println();
        }

        System.out.println("The second matrix: ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(ar2[i][j]+"  ");
            }
            System.out.println();
        }

    }

    public void sumMat(int [][]ar1, int [][]ar2, int r, int c){
        int [][]resMat = new int[r][c];
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                resMat[i][j] = ar1[i][j] + ar2[i][j];
            }
        }
        System.out.println("The sum of Two Matrix: ");
        for(int i = 0;i<r;i++){
            for(int j = 0;j<c;j++){
                System.out.print(resMat[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        matrixSum obj = new matrixSum();
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter row count: ");
        int row  = sc.nextInt();
        System.out.print("Enter column count: ");
        int col = sc.nextInt();
        int [][]arr1 = new int[row][col];
        int [][]arr2 = new int[row][col];
        System.out.println("Enter elements for 1st Matrix: ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println();
        System.out.println("Enter elements for 2nd Matrix: ");
        for(int i = 0;i<row;i++){
            for(int j = 0;j<col;j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        obj.printMat(arr1,arr2,row,col);
        obj.sumMat(arr1,arr2,row,col);
    }
}
