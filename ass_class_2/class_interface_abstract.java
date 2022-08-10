package ass_class_2;

public class class_interface_abstract {
    static interface IMaths{
        int sum(int x,int y);
        int multiply(int x,int y);

    }

    static class Maths implements IMaths {

        @Override
        public int sum(int x, int y) {
            // TODO Auto-generated method stub
            return x+y;
        }

        @Override
        public int multiply(int x, int y) {
            // TODO Auto-generated method stub
            return x*y;
        }
    }
    public static void main(String[] args){
        IMaths mth = new Maths();
        System.out.println("Sum: "+mth.sum(100,10));
        System.out.println("Multiply: "+mth.multiply(100,10));
    }
}
