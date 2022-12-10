package chap15;

class class009 implements Runnable{

    double s;
    String id;
    public class009(double n, String iid){
        s=n;
        id=iid;
    }

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Thread"+id+"is running");
            
            try
            {
                Thread.sleep((int)(s*1000));
            }
            catch(InterruptedException e){}
        }
        
    }
}

public class Class09 {
    
    public static void main(String[] args){
        
        class009 aa = new class009(1, "1");
        class009 bb = new class009(2.5, "2");

        Thread t1=new Thread(aa);   
        Thread t2=new Thread(bb);    
        t1.start();             
        t2.start(); 
    }
}
