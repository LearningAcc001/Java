package chap10;

class Caaa13{
    public int num1;
    public int num2;

    public Caaa13(){
        num1=1;
        num2=1;

    }
    public Caaa13(int a, int b){
        num1=a;
        num2=b;
    }
}

class Cbbb13 extends Caaa13{

    public Cbbb13(){
        super();

    }

    public Cbbb13(int a, int b){
        super(a, b); //呼叫父類引數的建構元
    }

    public void set_num(int n1, int n2){
        num1 = n1;
        num2 = n2;
    }
    public void show(){
        System.out.println(num1);
        System.out.println(num2);
    }
}

public class Class13 {
    public static void main(String[] args) {
        
        Cbbb13 bb = new Cbbb13();
        bb.set_num(5, 10);
        bb.show();

        Cbbb13 aa = new Cbbb13(18,20);
        aa.show();

        Cbbb13 cc = new Cbbb13();
        cc.show();


    }
}
