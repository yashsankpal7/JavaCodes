package assignment;

public class StringBufffer_ {
    public static void main(String[] args) {
        System.out.println("Written By Yash");

        StringBuffer sb = new StringBuffer("Yash");

        System.out.println(sb.capacity());
        System.out.println(sb.charAt(2));
        System.out.println(sb.length());
        System.out.println(sb.reverse());
        System.out.println(sb.indexOf("Y"));
        System.out.println(sb.toString());
        System.out.println(sb.append(" yash"));
        System.out.println(sb.deleteCharAt(1));
        System.out.println(sb.insert(1, 'e'));
        System.out.println(sb.codePointAt(7));
    }
}
