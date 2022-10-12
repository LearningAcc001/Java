package chap09;


class CRectangle{
    int width;
    int height;
   
    public CRectangle(int w,int h)
    {
        width=w;
        height=h;
    }

    public CRectangle()
    {
        width=10;
        height=8;
    }
   
    public void show()
    {
    
        System.out.println("width="+width);
        System.out.println("height="+height+"\n");
    }
     
}


public class Class01 {
    public static void main(String[] args){

        //(b)
        CRectangle one = new CRectangle(5,2);
        one.show();
        
        //(c)
        CRectangle two = new CRectangle();
        two.show(); 
    }
}
