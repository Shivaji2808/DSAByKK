package Java_Programming_Lab;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "Hello Welcome to VIT";
        String s2 = "Welcome to VIT";
        String s3 = "Exams are going on";

        System.out.println("Strings are: \n"+s1+"\n"+s2+"\n"+s3);
        System.out.println("\nString lengths are: \n"+s1+" "+s1.length()+"\n"+s2+" "+s2.length()+"\n"+s3+" "+s3.length());
        System.out.println("\nFifth Character of S1: "+s1.charAt(4));
        System.out.println("Index of first occurrence of 'l' in S1 is "+s1.indexOf('l'));
        System.out.println("Index of 'l' in S1 from the given index is "+s1.indexOf('l',4));
        System.out.println("Substring from param to param-1 is "+s2.substring(3,10));
        System.out.println("String in Lowecase: "+s1.toLowerCase());
        System.out.println("String in UpperCase: "+s1.toUpperCase());
        System.out.println(s1+" contains "+s2+" "+s1.contains(s2));
        System.out.println(s2+" in "+s1+" is replaced by "+ s3);
        String s4 = s1.replace(s2,s3);
        System.out.println(s4);
        System.out.println("Given String is "+s1);
        s1 = "New Value";
        System.out.println("After updating S1 = "+s1);
    }
}
