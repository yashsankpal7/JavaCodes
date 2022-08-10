package ass_class_2;

public class class_interfaces {
    static interface IMaths{
        int sum(int x,int y);
        int multiply(int x,int y);

    }

    static class Maths implements class_interface_abstract.IMaths {

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
        Maths mth = new Maths();
        System.out.println("Sum: "+mth.sum(100,10));
        System.out.println("Multiply: "+mth.multiply(100,10));
    }
}
