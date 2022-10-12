package chap09;

class tt{

    public void add2n(int n){
         
        System.out.println((1+n)*n/2);
    }

}


public class Class06 {
    public static void main(String[] args) {
        
        tt a = new tt();
        a.add2n(5);
        a.add2n(10);

    }
}
