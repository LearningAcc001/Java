package chap12.Class09.pack9.sub2;

public class CTrapezoid {
    
    int upper;
    int base;
    int height;
    public CTrapezoid(int u, int b, int h){
        upper=u;
        base=b;
        height=h;
    }
    public void show(){
        System.out.println("梯形上底: "+upper);
        System.out.println("梯形下底: "+base);
        System.out.println("梯形高: "+height);
        System.out.println("梯形面積: "+(upper+base)*height/2);
        System.out.println("==========================");
    }
}
