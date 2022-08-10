package classWork;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static  void main(String[] args) throws IOException {
        System.out.println("Written by Yash");
        FileInputStream fs = new FileInputStream("C:\\Users\\yash sankpal\\Desktop\\DataFile.txt");
        FileOutputStream fo = new FileOutputStream("C:\\Users\\yash sankpal\\Desktop\\DataOut.txt");
        int ch = 0;
        while((ch=fs.read())!=-1){
            fo.write(ch);
        }

        System.out.println("Written Successfully...");
    }
}
