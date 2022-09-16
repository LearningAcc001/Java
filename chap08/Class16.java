
class CSphere{
    private int x;
    private int y;
    private int z;
    private int radius;

    void setLocation(int x1, int y1, int z1){
        x = x1;
        y = y1;
        z = z1;
    }
    void setRadius(int r){
        radius = r;
    }

    double surfaceArea(){
        return (double)(4*3.14*radius*radius);
    }

    double volume(){
        return (double)((4/3)*3.14*radius*radius*radius);
    }

    void showCenter(){
        System.out.println("圓心座標: ("+x+","+y+","+z+")");
    }
}

public class Class16 {
    public static void main(String[] args) {
        CSphere cs = new CSphere();
        cs.setLocation(3, 4, 5);
        cs.setRadius(1);

        // System.out.println(cs.surfaceArea());
        // System.out.println(cs.volume());
        // cs.showCenter();
    }
}
