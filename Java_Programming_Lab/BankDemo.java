package Java_Programming_Lab;

import java.util.Scanner;
class Bank{
    Scanner sc = new Scanner(System.in);
    String accName,accNo,Branch;
    float accBal=0;
    char accType;
    static float average;
    public void input(){
        System.out.println("Enter the Account Number");
        accNo = sc.next();
        System.out.println("Enter the Name of the Account");
        accName = sc.next();
        System.out.println("Enter the Type of the Account -> S for Saving, C for Current");
        accType = sc.next().charAt(0);
        sc.nextLine();
        System.out.println("Enter the Branch of the Account");
        Branch = sc.next();
    }
    void printDetails(){
        System.out.print("The Account Number is: "+accNo);
        System.out.print("\nThe Name of the Account is: "+accName);
        if(accType=='S' || accType=='s'){
            System.out.println("\nAccount Type is Savings");
        }
        else if(accType=='C' || accType=='c'){
            System.out.println("Account Type is Current");
        }
        System.out.println("The Branch of the Account is: "+Branch);
        System.out.println("Availabe Balance: "+accBal);
        System.out.println();
    }
    void Deposit(int dep){
        accBal = accBal+dep;
        System.out.println("Account Balance: "+accBal);
    }
    void Withdraw(int amt){
        if(accType=='S' || accType=='s')
            if(accBal>=2000){
                accBal = accBal-amt;
            }
            else{
                System.out.println("Account Balance is not sufficient");
            }
        else{
            accBal = accBal-amt;
        }
    }
    static float avgBal(float sum, int n){
        average = sum/n;
        return average;
    }
}
public class BankDemo
{
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the user limit: ");
        int n = sc.nextInt();
        float sum=0;
        int amount;
        Bank []obj = new Bank[n];
        for(int i = 0;i<n;i++){
            obj[i] = new Bank();
            obj[i].input();
            obj[i].printDetails();
            System.out.println("Choose the operation: ");
            System.out.print("1:Deposit, 2:Withdraw, 3:User Details");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.print("\nEnter the amount to deposit: ");
                    amount = sc.nextInt();
                    obj[i].Deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter amount to withdraw:");
                            amount = sc.nextInt();
                    obj[i].Withdraw(amount);
                    break;
                case 3:
                    System.out.println("User Details: ");
                    obj[i].printDetails();
                    break;
                default:
                    System.out.println("Enter a valid input");
            }
            sum = sum + obj[i].accBal;
        }
        System.out.println("Average balance is " +
                Bank.avgBal(sum,n));
    }
}
