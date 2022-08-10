package ass_class_2;

public class _33 {
    public static void main(String[] args) {
        String st = "Yash";

        System.out.println("String length: "+st.length());
        System.out.println("Charachter at 3 "+st.charAt(3));
        System.out.println("Index of s "+st.indexOf('s'));
        System.out.println("String in lower case "+st.toLowerCase());
        System.out.println("String in upper case "+st.toUpperCase());
        System.out.println("Substring: "+st.substring(2, 3));
        String[] result = st.split("");
        System.out.println("Split based on '' ");
        for (String a : result)
            System.out.println(a);
        System.out.println("Replace a's with s's "+st.replace('a', 's'));
        System.out.println("Hashcode "+st.hashCode());
        System.out.println("string trim "+st.trim());
        System.out.println("Contains ash? "+st.contains("ash"));
        System.out.println("Concatenate Yash and Sankpal: "+st.concat(" Sankpal"));
        System.out.println("String empty? "+st.isEmpty());
        System.out.println("Last index of a: "+st.lastIndexOf('a'));
        System.out.println("Starts with Yash? "+st.startsWith("yash"));
        System.out.println("Equals to yash:"+st.equals("yash"));
        System.out.println("Equals to yash:"+st.equalsIgnoreCase("Yash"));

    }
}
