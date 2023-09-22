package first_java;

import java.util.Scanner;
class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i = n/2; i>=1; i--){
            if(n%i == 0){
                String substr = s.substring(0,i);
                StringBuilder newstr = new StringBuilder();
                for(int j=1;j<=n/i;j++){
                    newstr.append(substr);
                }
                if(newstr.toString().equals(s)){
                    return true;
                }
            }
        }
        return false;
    }
}
public class repeatedSubstringPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution s1 = new Solution();
        boolean flag = s1.repeatedSubstringPattern(s);
        System.out.println(flag);

    }
}
