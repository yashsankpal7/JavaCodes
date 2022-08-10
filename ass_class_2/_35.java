package ass_class_2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class _35 {
    public static void main(String[] args) {
        System.out.println("Written By Yash");

        StringIndexOutOfBound();
        NumberFormat();
        Arithmetic();
        NullPointer();
        ArrayIdexOutOfBound();
        Argument();
        IllegalThreadState();
        ClassCast();
        Initializer();
        FileNotFound();
    }

    static void StringIndexOutOfBound() {
        try {
            String a = "This is like chipping "; // length is 22
            char c = a.charAt(24); // accessing 25th element
            System.out.println(c);
        }
        catch(StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException");
        }
    }
    static void NumberFormat() {
        try {
            // "akki" is not a number
            int num = Integer.parseInt ("akki") ;

            System.out.println(num);
        } catch(NumberFormatException e) {
            System.out.println("Number format exception");
        }
    }
    static void Arithmetic() {
        try {
            int a = 30, b = 0;
            int c = a/b;  // cannot divide by zero
            System.out.println ("Result = " + c);
        }
        catch(ArithmeticException e) {
            System.out.println ("Can't divide a number by 0");
        }
    }
    static void NullPointer() {
        try {
            String a = null; //null value
            System.out.println(a.charAt(0));
        } catch(NullPointerException e) {
            System.out.println("NullPointerException..");
        }
    }
    static void ArrayIdexOutOfBound() {
        int a[] = new int[10];
        try {
            System.out.println("a [0] "+a[0]);
            System.out.println("a [11] "+a[11]);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array Index Out of bound ..");
        }
    }
    static void Argument() {
        Thread t = new Thread();
        try {
            t.setPriority(1000);
        }catch(IllegalArgumentException e) {
            System.out.println("Illegal argument ..");
        }
    }
    static void IllegalThreadState() {
        Thread t = new Thread();
        try {
            t.start();
            t.start();
        }catch(IllegalThreadStateException e) {
            System.out.println("thread state ..");
        }
    }
    static void	ClassCast() {
        try {
            String s = new String("Online tutorials point");
            Object o = (Object) s;

            Object o1 = new Object();
            String s1 = (String) o1;
        }catch(ClassCastException e) {
            System.out.println("ClassCast ...");
        }
    }
    static void Initializer() {
        try {
            int a[] = new int[-1];
            a[1] = 100;
        }catch(NegativeArraySizeException e) {
            System.out.println("NegativeArraySizeException e ..");
        }
    }
    static void FileNotFound() {
        try {

            // Following file does not exist
            File file = new File("E://file.txt");

            FileReader fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("File does not exist");
        }
    }
}
