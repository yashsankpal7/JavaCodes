package classWork;

public class Throw_ {
    private int id;
    private String name;
    private String div;

    Throw_(){
        id=0;
        name="Zahard";
        div="D";
    }

    static void display(Throw_ th_){
        try{
            if(th_ == null) throw new NullPointerException("Obj is null");
        }catch(NullPointerException ee){
            ee.printStackTrace();
        }
    }
    public static void main(String[] args){
        System.out.println("Written By Yash");
        Throw_ th_ = null;
        display(th_);
    }
}
