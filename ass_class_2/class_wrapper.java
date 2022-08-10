package ass_class_2;

public class class_wrapper {
    public static void main(String[] args){
        int x=20;

        Integer xi = new Integer(x);

        System.out.println("Data in integer obj: "+xi);
        xi = new Integer(20);

        System.out.println("Data in primitive data type: "+xi);

    }
}
