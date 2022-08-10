package classWork;

public class FinallyBlock {
    private int id;
    private String name;
    private String div;

    FinallyBlock(){
        id=0;
        name="Zahard";
        div="D";
    }

    void display(Throw_ th_){
        System.out.println("Written By Yash");
        try{
            if(th_ == null) throw new NullPointerException("Obj is null");
        }catch(NullPointerException ee){
            ee.printStackTrace();
        }finally {
            System.out.println("Executing till the end!");
        }
    }
    public static void main(String[] args){
        FinallyBlock fb = new FinallyBlock();
        fb.display(null);
    }
}
