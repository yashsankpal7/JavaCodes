package classWork;

public class ExtendingInterfaces_ {
    static interface IMaths{
        int sum(int x,int y);
        int minus(int x,int y);

    }
    static  interface IMaths2 extends IMaths{
        int product(int x,int y);
    }
    static class Maths implements IMaths2 {

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


        @Override
        public int product(int x, int y) {
            return x*y;
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Maths mth = new Maths();
        System.out.println("Sum: "+mth.sum(100,10));
        System.out.println("Minus: "+mth.minus(100,10));
        System.out.println("Product: "+mth.product(100,10));
    }
}
