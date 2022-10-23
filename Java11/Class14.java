
interface iVolume{
    public void showData();
    public double vol();
}

abstract class CSphere implements iVolume{

    final double PI =3.14;
    protected int x;
    protected int y;
    protected int r;

    public void showData(){

        System.out.println("球心:("+x+","+y+")");
        System.out.println("半徑:"+r);
        System.out.println("球體積:"+vol());
    }

    public double vol(){
        

        return (double)4/3*PI*r*r*r;
    }

}

class CCircle extends CSphere{

    
    public CCircle(int x1, int y1, int r1){
        r= r1;
        x=x1;
        y=y1;
    }

    
    
}

public class Class14 {
    public static void main(String[] args) {
        CCircle cir = new CCircle(8,6,2);
        cir.showData();
    }
}
