package chap10;

class Caaa14{
    public int num1;
    public int num2;

    public Caaa14(){
        num1=1;
        num2=1;

    }
    public Caaa14(int a, int b){
        num1=a;
        num2=b;
    }
}

class Cbbb14 extends Caaa14{

    public Cbbb14(){
        super();
    }

    public Cbbb14(int a, int b){
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

public class Class14 {
    
    public static void main(String[] args) {
        Cbbb14 bb = new Cbbb14();
        bb.set_num(5, 10);
        bb.show();

        Cbbb14 aa = new Cbbb14(18,20);
        aa.show();

    }
}
