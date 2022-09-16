
class CCircle1{
    
    double area(double r){

        return (double)(r*r*3.14);
    }

    float area(float r){

        return (float)(r*r*3.14);
    }

    int area(int r){

        return (int)(r*r*3.14);
    }



}

public class Class13 {
    public static void main(String[] args) {
        CCircle1 cc = new CCircle1();

        System.out.println("area(2) = "+cc.area(2));
        System.out.println("area(2.2f) = "+cc.area(2.2f));
        System.out.println("area(2.2) = "+cc.area(2.22));

    }
}
