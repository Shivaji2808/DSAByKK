package Conditional_loops_Intermediate;

import java.util.Scanner;

public class ProductDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the product price: ");
        int Product_price = sc.nextInt();
        System.out.print("Enter the discount rate: ");
        int discount = sc.nextInt();
        ProductDiscount obj = new ProductDiscount();
       obj.Pdiscount(Product_price,discount);
    }

    void Pdiscount(int productPrice, int discount) {
        int discounted_Price = productPrice - (productPrice*discount)/100;
        System.out.println("The Discounted Price: " + discounted_Price);
    }
}
