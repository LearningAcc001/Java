package chap13;

import java.util.Scanner;

class IntegerTooSmal extends Exception{

}
class IntegerTooLarge extends Exception{

}
class InputMismatchException extends Exception{

}

class class014{

    public void intp(int a) throws IntegerTooSmal, IntegerTooLarge, InputMismatchException{

        if(a<10){
            throw new IntegerTooSmal();
        }
        else if (a<70){
            throw new IntegerTooLarge();
        }
        else if (a>10 && a<70){
            System.out.println(a);
        }
        else{
            throw new InputMismatchException();
        }
    }
}

public class Class14 {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        sc.close();

        class014 aa = new class014();
        try{
            aa.intp(num1);
        }
        catch(IntegerTooSmal e1){
            System.out.println("您输入的整数的值太小");
        }
        catch(IntegerTooLarge e2){
            System.out.println("您输入的整数的值太大");
        }
        catch(InputMismatchException e3){
            System.out.println("您输入的不是整数");
        }
        
    }
}
