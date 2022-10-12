package chap09;

class C07{

    public static void power(int x, int n){

        System.out.println(Math.pow(x, n));

    }
}

public class Class07 {
    public static void main(String[] args) {

        C07.power(2, 5);
        C07.power(3, 2);
    }
}
