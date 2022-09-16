
class CTest {

    int x;

    void test(int x){
        
        if (x==0){
            System.out.println(x+" 此數為0");
        }else if (x%2==0){
            System.out.println(x+" 此處為偶數");
        }
        else{
            System.out.println(x+" 此數為奇數");
        }


    }
}
public class Class07 {
    
    public static void main(String[] args) {
        CTest tt = new CTest();
        tt.test(3);
        tt.test(8);
        tt.test(0);
        

    }
}
