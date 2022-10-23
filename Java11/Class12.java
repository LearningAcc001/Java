
interface Data{

    public void best();
    public void failed();
}

interface Test extends Data{
    
    public void showData();
    public double average();
}

class CStu implements Test{

    protected String name;
    protected int math;
    protected int english;

    public CStu(String na, int ma, int eng){
        name = na;
        math = ma;
        english = eng;

    }

    public void best(){

        if(math>english){
            System.out.println(name+"的數學比英文好");
        }
        else{
            System.out.println(name+"的英文比數學好");
        }
    }

    public void failed(){

        if (math<60){
            System.out.println(name+"的數學當掉了");
        }
        if (english<60){
            System.out.println(name+"的英文當掉了");
        }
    }

    public void showData(){

        System.out.println("姓名:"+name);
        System.out.println("數學成績:"+math);
        System.out.println("英文成績:"+english);
        System.out.println("平均成績:"+average());

    }

    public double average(){
        return (double)(math+english)/2;
    }

    public void show(){

        showData();
        best();
        failed();
    }
}


public class Class12 {
    public static void main(String[] args) {
        CStu stu = new CStu("Judy",58,91);
        stu.show();
    }
}
