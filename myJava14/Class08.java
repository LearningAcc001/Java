package chap14;

import java.io.*;

public class Class08 {
    
    public static void main(String[] args) throws IOException{
        
        FileReader aaa=new FileReader("C:/Users/user/Desktop/物件導向/chap14/aaa.txt"); 
        FileReader bbb=new FileReader("C:/Users/user/Desktop/物件導向/chap14/bbb.txt"); 
        FileWriter ccc = new FileWriter( "C:/Users/user/Desktop/物件導向/chap14/ccc.txt");
        BufferedReader aaabfr=new BufferedReader(aaa);
        BufferedReader bbbbfr=new BufferedReader(bbb);
        
        String str1, str11="";
        String str2, str22="";
        while((str1=aaabfr.readLine())!=null) 
        {
            System.out.println(str1);
            str11=str11+str1;
        }
        while((str2=bbbbfr.readLine())!=null) 
        {
            System.out.println(str2);
            str22=str22+str2;
        }
        BufferedWriter cccbfw = new BufferedWriter(ccc);
        cccbfw.write(str11);
        cccbfw.newLine();
        cccbfw.write(str22);


        aaabfr.close();
        bbbbfr.close();
        cccbfw.close();

    }
}
