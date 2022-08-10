package ass_class_2;

public class class_methodOverload {

    static class Maths{
        public int sum(int x, int y) {
            return x+y;
        }

        public double sum(double x, double y) {
            return x+y;
        }
    }

    public static void main(String[] args) {
        System.out.println("Written By Yash");

        Maths obj = new Maths();
        System.out.println("Sum of int: "+obj.sum(1,2));
        System.out.println("Sum of int: "+obj.sum(1.2,2.0));
    }
}
