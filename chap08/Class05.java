
class CBox{
    int length;
    int width;
    int height;

    void volume(){

        System.out.println("volume="+length*width*height);
    }
 
    void surfaceArea(){

        System.out.println("surfaceArea= "+(length*width)*6);
    }

    void showData(){

        System.out.println("length= "+length);
        System.out.println("width= "+width);
        System.out.println("height= "+height);
    }

    void showAll(){   
        showData();
        surfaceArea();
        volume();
    }
}

public class Class05 {
    
    public static void main(String[] args){

        CBox box = new CBox();
        box.length = 1;
        box.width = 1;
        box.height = 1;
        box.showAll();
    }
}
