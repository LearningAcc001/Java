package chap13;

class NotTriangle extends Exception{

}
class EquilateralTriangle extends Exception{

}
class NotEquilateralTriangle extends Exception{

}

class triangleA{

    public void triangle(int a, int b, int c) throws NotTriangle, EquilateralTriangle ,NotEquilateralTriangle{

        if((a+b)<c || (a+c)<b  || (b+c)<a){
            throw new NotTriangle();
        }
        else if (a==b && a==c && b==c){
            throw new EquilateralTriangle();
        }
        else{
            throw new NotEquilateralTriangle();
        }
    }
}


public class Class12 {
    
    public static void main(String[] args) {
        
        triangleA aa = new triangleA();
        try{
            aa.triangle(3, 3, 3);
            // aa.triangle(1, 1, 3);
            // aa.triangle(2, 3, 3);
        }   
        catch(NotTriangle e1){
            System.out.println(e1+" throwed");
            System.out.println("不構成三角形");
        }
        catch(EquilateralTriangle e2){
            System.out.println(e2+" throwed");
            System.out.println("這是正三角形");
        }
        catch(NotEquilateralTriangle e3){
            System.out.println(e3+" throwed");
            System.out.println("這不是正三角形");
        }
    }
}
