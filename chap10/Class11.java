package chap10;

class CShape10{
    public double area(){
        return 0.0;
    }

    public static void largest(CShape10 arr[]){

        // Arrays.sort(arr);
        System.out.println(arr);

    }
}

class CCircle10 extends CShape10{

    public CCircle10(int rr){
        area(rr);
    }
    public double area(int r){
        double areas = r*r*3.14;
        System.out.println("圓形面積:"+areas);
        return areas;
    }
}

class CSquare10 extends CShape10{

    public CSquare10(int s){
        area(s);
    }

    public double area(int s){
        double areas = s*s;
        System.out.println("正方形面積:"+areas);
        return areas;
    }
}

class CTriangle10 extends CShape10{

    public CTriangle10(int a, int b){
        area(a,b);
    }

    public double area(int b, int h){
        double areas = b*h/2;
        System.out.println("三角形面積:"+areas);
        return areas;
    }
}

public class Class11 {
    public static void main(String[] args) {
        
        CShape10 shp[] = new CShape10[6];
        shp[0] = new CCircle10(12);
        shp[1] = new CCircle10(21);
        shp[2] = new CSquare10(15);
        shp[3] = new CSquare10(51);
        shp[4] = new CTriangle10(12, 7);
        shp[5] = new CTriangle10(3, 18);


    }
}
