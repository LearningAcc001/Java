package chap14;

import java.io.*;

public class Class07 {
    
    public static void main(String[] args) throws IOException{
        
        String str;
        int count=0;

        FileReader fr=new FileReader("C:/Users/user/Desktop/物件導向/chap14/donkey.txt"); 
        BufferedReader bfr=new BufferedReader(fr);
        while((str=bfr.readLine())!=null && count<2)   // �C��Ū���@��A�����ɮ׵���
        {
            count++;                   // �p��Ū�������
            System.out.println(str);
        }

        fr.close();
    }
}
