package chap15;


class other1{
    public static int sum=200;
    public static void talk(int n){
        sum=sum-n;
        System.out.println("餘額:"+sum+"元");
        
        try
        {
            Thread.sleep(2000);   
        }
        catch(InterruptedException e){}

    }
}

class PrePaid extends Thread{
   
    public synchronized void run(){
        
        int fee = (int)(Math.random()*99);
        System.out.println(fee);
        if (other1.sum>10){
            other1.talk(fee);
            
        }
    }
}

public class Class14 {
    
    public static void main(String[] args) {
        
        PrePaid a1 = new PrePaid();
        PrePaid a2 = new PrePaid();
        PrePaid a3 = new PrePaid();

        a1.start();
        try{
            a1.join();
            a2.start();
            a2.join();
            a3.start();
            a3.join();
        }
        catch(InterruptedException e){}

        

    }
}
