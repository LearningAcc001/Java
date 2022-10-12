package chap09;

class CCircle0     
{
    private static double pi=3.14;
    private double radius;

    public CCircle0(double r)      
    {
        radius=r;
    }
    public void show()
    {
        System.out.println("area="+pi*radius*radius);
    }
}

public class Class16 {
    public static void main(String[] args) {
        CCircle0 cir[];
        cir=new CCircle0[6];

        for (int i=0; i<6;i++)
            cir[i]=new CCircle0(i);
            
        for (int i=0; i<6;i++)
            cir[i].show(); 
    }
}
