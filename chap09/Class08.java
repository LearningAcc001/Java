package chap09;

class CWin{
    private static int cnt =0;
    static String color;
    static int width;
    static int height;

    public static void count(){
        cnt++;
        System.out.println(cnt);
    }

    public CWin(String str, int w, int h){
        color = str;
        width = w;
        height = h;
    }
    public CWin(){
        color = "Red";
        width = 2;
        height = 2;
    }
    public void setZero(){
        cnt = 0 ;
    }
    public void setValue(int n){
        cnt = n;
    }
    
}

public class Class08 {
    public static void main(String[] args) {
        
        CWin a=new CWin();
        CWin.count();
        CWin.count();
        a.setZero();
        CWin.count();

    }
}
