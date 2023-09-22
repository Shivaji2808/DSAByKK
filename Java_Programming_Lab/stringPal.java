package Java_Programming_Lab;

class Solution {
    boolean isPalindrome(String S) {
        int n = S.length();
            int i = 0;
            for(int j = n-1;j>0;j--){
                if(S.charAt(i)!=S.charAt(j)){
                    return false;
                }
               i++;
            }
        return true;
    }
}
public class stringPal {
    public static void main(String[] args) {
        String s = "ramararamar";
        Solution obj1 = new Solution();
        if(obj1.isPalindrome(s)){
            System.out.println("Palindrome");
        }
        else System.out.println("Not Palindrome");
    }
}
