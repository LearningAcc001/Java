package 小考1;

class Data{
    private String name;
    private int score1;
    private int score2;

    public Data(String n, int e, int m){
        name=n;
        score1=e;
        score2=m;
    }

    class Test{
        int english;
        int math;

        public Test(int eng,int m){
            english = eng;
            math = m;
        }
        double avg(){
            return (double)(english+math)/2;
        }
    }
    Test ss = new Test(score1,score2);
    

    public void show(){
        System.out.println("name:"+name+" english:"+score1+" math:"+score2+" avg:"+ss.avg());
    }

}

public class Class02 {
    public static void main(String[] args) {

        Data S1= new Data("Annie", 85, 95);
        S1.show();
        Data S2 = new Data("Brian", 77, 56);
        S2.show();


    }
}
