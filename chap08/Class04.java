
class CBox{
    int length;
    int width;
    int height;
}

public class Class04 {
    
    public static void main(String[] args){
        CBox box;
        box = new CBox();
        box.length = 15;
        box.width = 10;
        box.height = 25;

        System.out.println("box.length = "+box.length);
        System.out.println("box.width = "+box.width);
        System.out.println("box.height = "+box.height);
    }
}
