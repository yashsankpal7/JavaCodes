package assignment;
import java.util.*;

class MovieClass{
    String name;

    public MovieClass(String name){
        this.name = name;
    }


    public void update(String name) {
        this.name = name;
    }

}

public class CRUD_MOVIE {
    public static void main(String[] args) {
        System.out.println("Written By Yash");
        boolean flg=true;

        Map<Integer,MovieClass> map = new HashMap<Integer,MovieClass>();

        int num;

        Scanner sc=new Scanner(System.in);

        while(flg) {
            System.out.println("1.Create");
            System.out.println("2.Read/Display");
            System.out.println("3.Update");
            System.out.println("4.Delete");
            System.out.println("5.Exit");
            System.out.println("Enter number: ");

            num = sc.nextInt();
            switch(num){
                case 1:
                    map.put(map.size(),new MovieClass(sc.next()));
                    break;
                case 2:
                    map.forEach( (k,v) -> System.out.println(v.name));
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Enter number: ");
                    num = sc.nextInt();
                    map.get(num).update("update"+num);
                    break;
                case 4:
                    System.out.println("Enter number: ");
                    num = sc.nextInt();
                    map.remove(num);
                    break;
                case 5:
                    flg=false;
                    break;
                default:
                    System.out.println("Enter 1-5");
            }
        }
    }
}
