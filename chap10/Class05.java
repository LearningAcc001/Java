package chap10;

class Caaa5{
    private int num;
    public Caaa5(int n){
        num = n;
    }
    public int get(){
        return num;
    }
}

class Cbbb5 extends Caaa5{
    public Cbbb5(){
        super(2);
    }
    public void show(){
        System.out.println("num="+get());
    }
}

public class Class05 {
    public static void main(String[] args) {

        Cbbb5 bb =new Cbbb5();
        bb.show();
    }
}
