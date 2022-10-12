class Data{
    private String name;
    private Test score;
    private Test data;

    public Data(String n, int e, int m){
        this.name=n;
        data=new Test(e,m);
    }

    class Test{
        int english;
        int math;
        public Test(){

        }
        public Test(int eng,int m){
            english = eng;
            math = m;
        }

        double avg(){
            return ((english+math)/2);
        }
    }

    public void show(){
        System.out.println("name:"+name+" english:"+data.english+" math:"+data.math+" avg:"+data.avg());
    }

}

public class Class02 {
    public static void main(String[] args) {

        Data[] a = new Data[2];
        a[0] = new Data("Annie",85,92);
        a[1] = new Data("Brian", 77, 56);

        a[0].show();
        a[1].show();

    }
}
