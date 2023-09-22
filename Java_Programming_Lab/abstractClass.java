package Java_Programming_Lab;

import java.util.Objects;

abstract class RBI{
    abstract float ROI(float amount);
}
class IB extends RBI{
    float ROI(float amt){
        return (amt*5/100);
    }
}
class CBI extends RBI{
    float ROI(float amt){
        return (amt*5/100);
    }
}
public class abstractClass {
    public static void main(String[] args) {
        IB obj = new IB();
        CBI obj1  = new CBI();
        System.out.println(obj.ROI(5000));
        System.out.println(obj1.ROI(6000));
    }
}
