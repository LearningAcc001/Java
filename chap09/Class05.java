package chap09;

class CCount{
    static int cnt = 0;
    public CCount(){
        cnt ++;  
    }

    public void count(){
        System.out.println(cnt);

    }

    public void setZero(){
        cnt = 0;
    }
    public void setValue(int n){
        cnt = n;
    }

}

public class Class05 {
    public static void main(String[] args) {
        CCount a=new CCount();
        a.count();
        CCount b=new CCount();
        b.count();
        b.setZero(); //歸零cnt
        CCount c=new CCount();
        c.count();
        c.setValue(20); //設置cnt
        CCount d=new CCount();
        d.count();

    }
}
