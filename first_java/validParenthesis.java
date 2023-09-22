package first_java;

import java.util.Scanner;
import java.util.Stack;

public class validParenthesis {
    public static int isValidParentheses(String str){
        if(str.length()%2==0) {
           Stack<Character> st = new Stack<>();
           for(int i = 0;i<str.length();i++){
               char ch = str.charAt(i);
               if(st.isEmpty() || ch == '(' || ch == '[' || ch == '{'){
                   st.push(ch);
               }
               else {
                   char top = st.peek();
                   if (top == '(' && ch == ')' || top == '{' && ch == '}' || top == '[' && ch == ']') {
                       st.pop();
                   }
                   else return 0;
               }
           }
           return 1;
        }
        else return 0;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the parentheses sequence: ");
        String par = sc.nextLine();
        if(isValidParentheses(par)==1){
            System.out.println("Parentheses Sequence is Correct");
        }
        else{
            System.out.println("Invalid Parentheses Sequence");
        }
    }
}
