package chap14;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Class10 {
    
    public static void main(String[] args) throws IOException{
        
        FileWriter rand = new FileWriter( "C:/Users/user/Desktop/物件導向/chap14/rand.txt");

        BufferedWriter cccbfw = new BufferedWriter(rand);

        int count=0;
        while (count<1000){


            cccbfw.write(Integer.toString((int)(Math.random()*100000)+1));
            cccbfw.newLine();
            count++;
        }
        
        cccbfw.close();

        ArrayList<Integer> list = new ArrayList<Integer>();
        int max=0, min=99999, avg=0;
        FileReader rand2=new FileReader("C:/Users/user/Desktop/物件導向/chap14/rand.txt"); 
        BufferedReader rand2bfr=new BufferedReader(rand2);
        String str1;
        while((str1=rand2bfr.readLine())!=null) 
        {
            max = Math.max(max, Integer.parseInt(str1));
            min = Math.min(min, Integer.parseInt(str1));
            avg = avg+Integer.parseInt(str1);
            list.add(Integer.parseInt(str1));
        }
        System.out.println("平均值:"+avg/1000+ "最大值:"+max+" 最小值:"+min);
        rand2bfr.close();


        Collections.sort(list);

        FileWriter rand22 = new FileWriter( "C:/Users/user/Desktop/物件導向/chap14/rand2.txt");

        BufferedWriter rand2bfw = new BufferedWriter(rand22);

        for (int i=0;i<1000;i++){
            rand2bfw.write(Integer.toString(list.get(i)));
            rand2bfw.newLine();
        } 
        rand2bfw.close();

    }
}
