package classWork;

import java.io.FileInputStream;
import java.io.IOException;

public class FileReadDemo {
    public static  void main(String[] args) throws IOException {
        System.out.println("Written by Yash");
        FileInputStream fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\Data.txt");
        int ch = 0;
        while((ch=fs.read())!=-1){
            System.out.print((char)ch);
        }
    }
}
