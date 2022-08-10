package ass_class_2;

public class _22 {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};

        int i, k, t;
        for (i = 0; i < arr.length / 2; i++) {
            t = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = t;
        }

        for(int j:arr) System.out.print(j+", ");
    }
}
