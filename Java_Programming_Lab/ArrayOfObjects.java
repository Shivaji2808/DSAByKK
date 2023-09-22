package Java_Programming_Lab;

import java.util.Scanner;

class Demo{
    String regNo,name;
    int marks;


    void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the RegNO: ");
        regNo = sc.nextLine();
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter Marks: ");
        marks = sc.nextInt();
    }

    void print(){
        System.out.println();
        System.out.println("Registration Number: "+regNo);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println("Grade: "+findGrade());
    }

    char findGrade(){
        char Grade = '0';
        if(marks >= 90) Grade = 'S';
        if(marks<90 && marks>=80) Grade = 'A';
        if(marks<80 && marks>=70) Grade = 'B';
        if (marks<70 && marks>=60) Grade = 'C';
        if(marks<60 && marks>=50) Grade = 'D';
        if(marks<50 && marks>=40) Grade = 'E';
        if(marks<40) Grade = 'F';
        return Grade;
    }

}
public class ArrayOfObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the count of students: ");
        int n = sc.nextInt();
        Demo []obj1 = new Demo[n];
        for(int i = 0;i<n;i++){
            obj1[i] = new Demo();
            obj1[i].input();
        }
        for(int i =0;i<n;i++){
            obj1[i].print();
        }
    }
}
