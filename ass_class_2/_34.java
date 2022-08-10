package ass_class_2;

public class _34 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Yash");

        System.out.println("Capacity of string "+sb.capacity());
        System.out.println("Character at 2"+sb.charAt(2));
        System.out.println("Length of string"+sb.length());
        System.out.println("Reverse of string: "+sb.reverse());
        System.out.println("Position of y: "+sb.indexOf("Y"));
        System.out.println("Convert to String: "+sb.toString());
        System.out.println("Appending 'sankpal'"+sb.append(" Sankpal"));
        System.out.println("Deleting char at postion 1"+sb.deleteCharAt(1));
        System.out.println("Inserting e at position 1"+sb.insert(1, 'e'));
        System.out.println("Codepoint at 7 "+sb.codePointAt(7));
        System.out.println("Inserting *** at 4"+sb.insert(4," ***"));

    }
}
