package chap09;

public class Class18 {
    public static void main(String[] args) {
        
        CCircle b = new CCircle(5);
        
        (new CCircle(){
            void show()
            {   
                System.out.println("園面積:"+radius*radius*pi);
            }
        }).show(); 


    }

    static class CCircle{
        public double pi =3.14;
        static double radius;

        public CCircle(double r){
            radius =r;
        }
        public CCircle(){

        }
    }
}
