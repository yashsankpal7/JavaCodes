package ass_class_2;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class _54 {
    public static void check(String strFile,String strn) throws IOException {
        FileInputStream fs = null;
        try{
            int wordNum=0;
            String str="";
            fs = new FileInputStream(strFile);
            int ch = 0;

            System.out.println(strFile);
            while((ch=fs.read())!=-1) {
                str += Character.toString((char) ch);
            }

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
    public static void main(String[] args) throws IOException {
        File fi;
        Path start = Paths.get("C:\\Users\\yash sankpal\\Desktop\\Wissen_\\test");
        try (Stream<Path> stream = Files.walk(start, Integer.MAX_VALUE)) {

            Scanner sc = new Scanner(System.in);

            String strn;
            System.out.println("Enter the word: ");
            strn = sc.next();

            List<String> collect = stream
                    .map(String::valueOf)
                    .sorted()
                    .collect(Collectors.toList());

            for(String i: collect){
                fi = new File(i);
                if(fi.isFile()){
                    check(i,strn);
                }
            }
        }
    }
}
