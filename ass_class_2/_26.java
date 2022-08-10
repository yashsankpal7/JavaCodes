package ass_class_2;

public class _26 {
    static int largest(int x,int y,int z){
        return (x>y)?(x>z)?x:z:(y>z)?y:z;
    }
    static int largest(int x,int y){
        return (x>y)?x:y;
    }
    public static void main(String[] args){
        System.out.println("Largest :"+largest(10,2));
        System.out.println("Largest :"+largest(10,2,11));
    }
}
