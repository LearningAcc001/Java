package chap14;

import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 

public class Class03 {
    
    public static void main(String[] args) throws IOException{
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("請輸入一個整數n: "); 
        String text = buf.readLine();

        int n =Integer.parseInt(text);
        System.out.println((1+n)*n/2);
    }
}
