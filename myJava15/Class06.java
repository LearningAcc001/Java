package chap15;

class Add implements Runnable {
    private int n;
    private int sum=0;
    public Add(int a){
        n=a;

        
    }
    public void run(){
        sum = (1+n)*n/2;
        System.out.println(sum);
    }
}

public class Class06 {
    
    public static void main(String[] args) {
        
        Add aa = new Add(5);
        Add bb = new Add(10);
        Thread t1=new Thread(aa);   
        Thread t2=new Thread(bb);    
        t1.start();             
        t2.start(); 
    }
}
