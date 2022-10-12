package chap09;

class CRational{
    public int n;
    public int d;

    public void setN(int num){
        n = num;
    }
    public void setD(int num){
        d = num;
    }
    public void show(){
        System.out.println(n+"/"+d);
    }

    public void setND(int num, int den){
        n = num;
        d = den;
    }
}

public class Class10b {
    public static void main(String[] args) {
        
        CRational aaa = new CRational();
        aaa.setN(2);
        aaa.setD(5);
        aaa.show();

        CRational bbb = new CRational();
        bbb.setND(5, 2);
        show(bbb);
        
        
    }
    public static void show(CRational obj) {
        System.out.println(obj.n+"/"+obj.d); // 顯示分數     
    }
}
