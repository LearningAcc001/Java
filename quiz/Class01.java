class Cal_area{

    Double volume1;
    int volume2;

    public Cal_area(int r){
        volume1 = 4/3*3.14*r*r*r;
    }

    public Cal_area(int h, int w, int l){
        volume2 = (h*w+w*l+h*l)*2;
    }
    public void show(){
        System.out.println(volume1);
    }
    public void show2(){
        System.out.println(volume2);
    }
}


public class Class01 {
    public static void main(String[] args) {
        Cal_area quiz1 = new Cal_area(10);
        quiz1.show();
        Cal_area quiz2 = new Cal_area(4, 5, 6);
        quiz2.show2();
    }
}
