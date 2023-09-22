package Java_Programming_Lab;
class statVar{
    int regNum,marks;
    String name;
    static float avg, objCount;
    statVar(int regNum, String name, int marks){
        this.regNum = regNum;
        this.name = name;
        this.marks = marks;
        objCount++;
        avg += marks;
    }
    void  print(){
        System.out.println();
        System.out.println("regNum: "+regNum);
        System.out.println("Name: "+name);
        System.out.println("Marks: "+marks);
        System.out.println();
    }
    public static void avgCal(){
        avg /=objCount;
        System.out.println("Average: "+avg);
    }
}
public class StaticVariable {
    public static void main(String[] args) {
        statVar obj1 = new statVar(2023,"Shivaji",87);
        statVar obj2 = new statVar(2024,"Shailesh",90);
        statVar obj3 = new statVar(2025,"Prabudh",77);
        statVar obj4 = new statVar(2026,"Palash",97);

        obj1.print();
        obj2.print();
        obj3.print();
        obj4.print();

        statVar.avgCal();
    }
}
