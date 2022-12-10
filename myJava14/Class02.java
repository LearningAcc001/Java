package chap14;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Class02 {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("請輸入一個字串: "); 
        String text = buf.readLine();

        System.out.println(text.toUpperCase()); 
    }
}
