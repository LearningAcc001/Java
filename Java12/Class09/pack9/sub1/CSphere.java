package chap12.Class09.pack9.sub1;

public class CSphere {
    double radius;
    public CSphere(double r){
        radius=r;
    }

    public void show(){
        System.out.println("球體半徑: "+radius);
        System.out.println("球體體積: "+4/3*3.14*radius*radius*radius);
        System.out.println("==========================");
        
    }
}
