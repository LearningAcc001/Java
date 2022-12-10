package chap13;

public class Class07 {

    public static void test() throws ArithmeticException{
        int num=12,den=0;
        int ans = num/den;
        System.out.println(ans);
    }

    public static void main(String[] args) {
        
        try
        {
            test();
            System.out.println("end of main()!!");
        }
        catch(ArithmeticException e)
        {
           System.out.println(e+" throwed");
        }
    }
    
}
