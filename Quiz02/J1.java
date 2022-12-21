package quiz2;

import java.util.Scanner;

class RuntimeException extends Exception{

}

class other{
    public static int count=1;
    public static String end ="No";
    
}

class quiz2_J2{

    public void intp(int num1, int num2) throws  RuntimeException{
    	
    	
    	if(num1!=num2) {
        	System.out.println("與第一次輸入的不同!");
        	other.count +=1;
        	if (other.count>3) {
        		throw new  RuntimeException();
        	}
        }
        else {
        	System.out.println("密碼正確");
        	other.end ="Yes";
        }
    }
}


public class J1 {

	public static void main(String[] args) {

		
		Scanner sc = new Scanner(System.in);
		System.out.print("請輸入密碼:");
        int num1 = sc.nextInt();
                
        quiz2_J2 aa = new quiz2_J2();
        
        try{
        	while (other.end!="Yes") {
        		System.out.print("請再輸入一次密碼:");
                int num2 = sc.nextInt();
        		aa.intp(num1,num2);
        	}   
        }
        catch(RuntimeException e){
            System.out.println("輸入三次錯誤!程式停止!");
        }

        sc.close();

        
	}

}
