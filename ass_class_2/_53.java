package ass_class_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class _53 {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = null;
        try{
            int wordNum=0;
            String str="",strn;
            Scanner sc = new Scanner(System.in);
            fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\Data.txt");
            int ch = 0;
            while((ch=fs.read())!=-1) {
                str += Character.toString((char) ch);
            }
            System.out.println("Enter the word: ");
            strn = sc.next();
            for(String i: str.split("[\\r\\n]+")){
                if(Arrays.stream(i.split(" ")).anyMatch(st-> st.equals(strn))){
                    System.out.println(i);
                    wordNum += Arrays.stream(i.split(" ")).filter(st->st.equals(strn)).count();
                }
            }
            System.out.println(" Word: "+wordNum);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            if(fs != null)
                fs.close();
        }
    }
}
