package chap14;
import java.io.*;

public class Class06 {
    
    public static void main(String args[]) throws IOException
   {
        try{
            char data[]=new char[128]; 
            FileReader fr=new FileReader("c:\\Java\\train.txt");  

            int num=fr.read(data);    
            String str=new String(data,0,num);     
            System.out.println("Characters read= "+num);
            System.out.println(str);

            fr.close();
        }
        catch(IOException e){
            System.out.println("捕捉到例外了");
            System.out.println(e);
        }
      
   }
}
