package chap13;
import java.io.*; 

class ArgumentOutOtBound extends Exception{

    int num;
    public ArgumentOutOtBound(int n){
        num=n;
    }
    public String getMessage(){
        return Integer.toString(num);
    }
}

class class015{

    public void mySqrt(int n) throws ArgumentOutOtBound{

        if (n>0){

            System.out.println(Math.pow(n, 0.5));
        }
        else{
            throw new ArgumentOutOtBound(n);
        }
    }
}

public class Class15 {
    
    public static void main(String[] args) throws IOException{
        
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in)); 
        System.out.print("請輸入一個數字: "); 
        String text = buf.readLine();

        class015 aa = new class015();
        try{
            aa.mySqrt(Integer.parseInt(text));
        }
        catch(ArgumentOutOtBound e){
            System.out.println(e.getMessage()+"小於0");
        }
        
    }
}
