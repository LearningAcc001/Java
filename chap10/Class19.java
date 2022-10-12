package chap10;

class CRectangle{
    protected int length;
    protected int width;

    public CRectangle(int l, int w){
        length =l;
        width = w;
    }

    public void println(){

        int area = length*width;
        System.out.println("length="+length+" ,width="+width+", area="+area);
    }
}

public class Class19 {
    
    public static void main(String[] args) {
        
        CRectangle rect = new CRectangle(2, 6);
        rect.println();

        System.out.println(rect.toString());
    
    
    }
}
