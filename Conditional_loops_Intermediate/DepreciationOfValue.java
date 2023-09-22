package Conditional_loops_Intermediate;

import java.util.Scanner;

public class DepreciationOfValue {

    void Deprec(int Asset, int Residual, int ULife){
        double DeprciationV = (double) (Asset - Residual) /ULife;
        System.out.println("Depreciation Value: " + DeprciationV);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of an Asset: ");
        int Asset = sc.nextInt();
        System.out.print("Enter the residual value: ");
        int Residual = sc.nextInt();
        System.out.print("Enter the useful life in Years: ");
        int ULife = sc.nextInt();
        DepreciationOfValue obj = new DepreciationOfValue();
        obj.Deprec(Asset, Residual, ULife);
    }
}
