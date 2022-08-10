package ass_class_2;

import java.io.FileInputStream;
import java.io.IOException;

public class Class_fileHandling {
    public static  void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\Data.txt");
        int ch = 0;
        while((ch=fs.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
