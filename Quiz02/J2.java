package quiz2;

import java.io.*;


public class J2 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		FileWriter rand = new FileWriter( "C:/Users/CJCU-User/Desktop/rand.txt");

        BufferedWriter cccbfw = new BufferedWriter(rand);

        int count=0;
        while (count<1000){


            cccbfw.write(Integer.toString((int)(Math.random()*100000)+1));
            cccbfw.newLine();
            count++;
        }
        
        cccbfw.close();
        
	}

}
