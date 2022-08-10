package assignment;

public class StringFunc_ {
    public static void main(String[] args) {
        System.out.println("Written By Yash");

        String st = "Yash";

        System.out.println(st.length());
        System.out.println(st.charAt(3));
        System.out.println(st.indexOf('s'));
        System.out.println(st.toLowerCase());
        System.out.println(st.toUpperCase());
        System.out.println(st.substring(2, 3));
        System.out.println(st.split(""));
        System.out.println(st.replace('a', 's'));
        System.out.println(st.hashCode());
        System.out.println(st.trim());
    }
}
