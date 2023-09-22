package Java_Programming_Lab;

import java.util.Scanner;

public class RegisterNumCheck {
    public boolean regNumVerify(String regNum){
        if(regNum.length()<9) return false;
        if(!Character.isDigit(regNum.charAt(0)) || !Character.isDigit(regNum.charAt(1))) return false;
        if(
                     !Character.isLetter(regNum.charAt(2)) ||
                     !Character.isLetter(regNum.charAt(3)) ||
                     !Character.isLetter(regNum.charAt(4))
        ) return false;
        if(
                        !Character.isDigit(regNum.charAt(5)) ||
                        !Character.isDigit(regNum.charAt(6)) ||
                        !Character.isDigit(regNum.charAt(7)) ||
                        !Character.isDigit(regNum.charAt(8))
        ) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Registration Number: ");
        String regNum = sc.next();
        System.out.println("Enter the Name: ");
        sc.nextLine();
        String name = sc.nextLine();
        RegisterNumCheck obj = new RegisterNumCheck();
        if(obj.regNumVerify(regNum)){
            System.out.println("\nRegistration Number is Valid:Printing User Details");
            System.out.println("\nName: "+name+"\nRegistration Number: "+regNum);
        }
        else{
            System.out.println("Please enter a valid Registration Number!!!");
        }
    }
}
