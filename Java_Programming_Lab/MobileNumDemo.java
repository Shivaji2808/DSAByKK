package Java_Programming_Lab;
import java.util.Scanner;
class MobileNumber{
    String name;
    long mobonum;
    void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter user name: ");
        this.name = scanner.nextLine();
        System.out.print("Enter mobile number: ");
        this.mobonum = scanner.nextLong();
    }

    void print(){
        System.out.println("Name: " + name);
        System.out.println("Mobile: " + mobonum);
    }
    public String findPrefix(MobileNumber obj2){
        String match = "";
        for(int i = 0;i<this.name.length();i++){
            if(this.name.charAt(i) == obj2.name.charAt(i))
                match+=this.name.charAt(i);
            else break;
        }
        return match.isEmpty()?null:match;
    }
}
public class MobileNumDemo{
    public static void main(String []a){
        MobileNumber obj1 = new MobileNumber();
        MobileNumber obj2 = new MobileNumber();

        obj1.input();
        obj2.input();

        obj1.print();
        obj2.print();

        String commonPrefix = obj1.findPrefix(obj2);
        if(commonPrefix != null)
            System.out.println("\nCommon Prefix: " + commonPrefix);
        else
            System.out.println("\nCommon Prefix Not Found");
    }
}
		
			


