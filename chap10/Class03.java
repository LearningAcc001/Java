package chap10;

class Caaa{
    public int num1;
    public int num2;

    public Caaa(){
        num1=1;
        num2=1;
    }
    public Caaa(int a, int b){
        num1=a;
        num2=b;
    }
}

class Cbbb extends Caaa{

    public Cbbb(){

    }

    public Cbbb(int a, int b){
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

public class Class03 {
    public static void main(String[] args) {

        Cbbb bb = new Cbbb();
        bb.set_num(5, 10);
        bb.show();

        Cbbb aa = new Cbbb(18,20);
        aa.show();
    }
}
