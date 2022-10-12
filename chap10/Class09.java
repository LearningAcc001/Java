package chap10;

class Caaa9{
    private int num;
    public Caaa9(int n){
        num = n;
    }
    public int get(){
        return num;
    }

    public void display(){
        System.out.println("printed from Caaa9 class");
    }
}

class Cbbb9 extends Caaa9{

    public Cbbb9(){
        super(2);
    }
    public void show(){
        System.out.println("num="+get());
    }

    public void display(){
        System.out.println("printed from Cbbb9 class");
    }
}

public class Class09 {
    public static void main(String[] args) {
        Cbbb9 aa =new Cbbb9();
        aa.show();

        Caaa9 bb = new Cbbb9();
        bb.display();  //printed from Cbbb9 class 子類別
    }
}
