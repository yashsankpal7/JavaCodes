package ass_class_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Class_fileWiritng {
    public static  void main(String[] args) throws IOException {
        System.out.println("Written by Yash");
        FileInputStream fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\Data.txt");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\Data.txt");
        int ch = 0;
        while((ch=fs.read())!=-1){
            fo.write(ch);
        }

        System.out.println("Written Successfully...");
    }
}
