package chap15;

class CTest1 implements Runnable{

    String id;

    public CTest1(String str){
        id=str;
    }

    public void run(){
        for(int i=1;i<=5;i++){
            for(int j=0;j<100000000;j++);
            System.out.println(id+" "+i);
    
            try
            {
                
                Thread.sleep(((int)(Math.random()*2))*1000);
            }
            catch(InterruptedException e){}
        }
    }
}

public class Class10 {
    
    public static void main(String[] args) {
        
        CTest1 hi = new CTest1("Hello");
        CTest1 bye = new CTest1("Good bye");
        CTest1 morning = new CTest1("Good morning");
        CTest1 night = new CTest1("Good night");

        Thread t1=new Thread(hi);   
        Thread t2=new Thread(bye);    
        Thread t3=new Thread(morning);   
        Thread t4=new Thread(night);  
        t1.start();             
        t2.start(); 
        t3.start();             
        t4.start(); 
    }
}
