package classWork;
interface IMaths{
    int sum(int x,int y);
    int minus(int x,int y);

}

class Maths implements IMaths{

    @Override
    public int sum(int x, int y) {
        // TODO Auto-generated method stub
        return x+y;
    }

    @Override
    public int minus(int x, int y) {
        // TODO Auto-generated method stub
        return x-y;
    }
}
public class Interfaces_ {
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Maths mth = new Maths();
        System.out.println("Sum: "+mth.sum(100,10));
        System.out.println("Minus: "+mth.minus(100,10));
    }
}
