package ass_class_2;

import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class _45 {
    static class Student {
        String name;
        int roll_no;

        Student(String name,int roll_no){
            this.name = name;
            this.roll_no = roll_no;
        }

        @Override
        public String toString() {
            return "Student| " + "name= " + name + ", roll_no= " + roll_no;
        }
    }

    public static void main(String[] args){
        Map<Integer,Student> map = new TreeMap<Integer,Student>();

        map.put(57,new Student("Yash",57));
        map.put(47,new Student("Sho",47));
        map.put(37,new Student("Tho",37));

        for(Map.Entry<Integer,Student> i:map.entrySet()){
            System.out.println(i.getValue());
        }

        map.clear();

        Scanner sc=new Scanner(System.in);

        int ch;
        boolean cont = true;

        int roll_no;
        String name;

        while(cont) {
            System.out.println("choice 1 Insert \nchoice 2 display \nchoice 3 display by choice \nchoice 4 Update \n choice 5 delete \nchoice 6 terminate\nchoose any one: ");
            ch=sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("Enter Student name and roll no.: ");
                    name = sc.next();
                    roll_no = sc.nextInt();
                    map.put(roll_no,new Student(name,roll_no));
                    break;
                case 2:
                    for(Map.Entry<Integer,Student> i:map.entrySet()){
                        System.out.println(i.getValue());
                    }
                    break;
                case 3:
                    System.out.println("Enter student roll no.: ");
                    roll_no = sc.nextInt();

                    if(!map.containsKey(roll_no)) System.out.println("Not there!!");
                    else{
                        System.out.println(map.get(roll_no));
                    }
                    break;
                case 4:
                    System.out.println("Enter student roll no.: ");
                    roll_no = sc.nextInt();

                    if(!map.containsKey(roll_no)) System.out.println("Not there!!");
                    else{
                        System.out.println("Enter Student name: ");
                        name = sc.next();
                        map.get(roll_no).name = name;
                    }
                    break;
                case 5:
                    System.out.println("Enter student roll no.: ");
                    roll_no = sc.nextInt();
                    map.remove(roll_no);
                    break;
                case 6:
                    cont=false;
                    break;
                default:
                    System.out.println("Select between 1 to 4....");
            }

            System.out.println("Thanks");
        }
    }
}
