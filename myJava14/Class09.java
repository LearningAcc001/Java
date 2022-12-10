package chap14;

import java.io.*;

public class Class09 {
    
    public static void main(String[] args) throws IOException{
        
        FileReader aaa=new FileReader("C:/Users/user/Desktop/物件導向/chap14/aaa.txt"); 
        FileReader bbb=new FileReader("C:/Users/user/Desktop/物件導向/chap14/bbb.txt"); 
        FileReader ccc=new FileReader("C:/Users/user/Desktop/物件導向/chap14/ccc.txt"); 

        BufferedReader aaabfr=new BufferedReader(aaa);
        BufferedReader bbbbfr=new BufferedReader(bbb);
        BufferedReader cccbfr=new BufferedReader(ccc);

        String str1, str2, str3;
        while((str1=aaabfr.readLine())!=null) 
        {
            System.out.println(str1);
        }
        while((str2=bbbbfr.readLine())!=null) 
        {
            System.out.println(str2);
        }
        while((str3=cccbfr.readLine())!=null) 
        {
            System.out.println(str3);
        }
        aaabfr.close();
        bbbbfr.close();
        cccbfr.close();
    }
}
