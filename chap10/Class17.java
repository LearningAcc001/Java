package chap10;

class Car{
    protected String owner;
    protected String id;

    final void show(){
        System.out.println("車主姓名:"+owner);
        System.out.println("車牌號碼:"+id);
    }

    public Car(String own,String s){
        owner = own;
        id = s;
    }
}

class CColor extends Car{
    public String color;

    public CColor(String own, String s, String cl){
        super(own, s);
        color = cl;
    }

    public void show1(){
        super.show();
        System.out.println("車身顏色:"+color);
    }
}

public class Class17 {
    public static void main(String[] args) {
        
        CColor mycar = new CColor("Riaan","A1-2345","Black");
        mycar.show1();
    }
}
