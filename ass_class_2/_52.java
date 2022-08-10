package ass_class_2;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

public class _52 {
    public static void main(String[] args) throws IOException {
        FileInputStream fs = null;
        try{
            int wordNum=0,lineNum=0,charNum=0;
            String str="";
            fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\Data.txt");
            int ch = 0;
            while((ch=fs.read())!=-1){
                str+=Character.toString((char)ch);
            }

            System.out.println(str);

            for(String i: str.split("[\\r\\n]+")){
                lineNum++;
                charNum+=i.split("").length;
                wordNum+=i.split(" ").length;
            }

            System.out.println("Line: "+lineNum+" Char: "+charNum+" Word: "+wordNum);
        }catch(Exception e){
            System.out.println(e);
        }finally {
            if(fs != null)
                fs.close();
        }
    }
}
