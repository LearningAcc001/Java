package chap13;

import java.util.Scanner;

class Exception520 extends Exception{

}


class intput1{

    public void in(int a) throws Exception520{

        if (a==520){
            throw new Exception520();
        }
        else{
            System.out.println(a);
        }
    }
}

public class Class13 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.close();
        intput1 aa = new intput1();
        try{
            aa.in(num1);
        }
        catch(Exception520 e1){
            System.out.println("這是由字串520所引起的例外");
        }
    }
}
