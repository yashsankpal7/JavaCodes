package temp;

import java.util.PriorityQueue;
import java.util.stream.Collectors;

public class sandbox {
    public static void main(String[] args){

        int[] arr = {8,5};
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for( int i:arr) pq.add(i);

        while(pq.stream().reduce(0, Integer::sum) != arr.length){
//            pq.add(peek - pq.stream().reduce(0, Integer::sum));
        }

        pq.forEach(System.out::println);
    }
}

class Main {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

        pq.add(25);
        pq.add(-22);
        pq.add(1343);
        pq.add(54);
        pq.add(0);
        pq.add(-3492);
        pq.add(429);

//        System.out.println(pq.peek());
//        System.out.println(pq.remove());
//        System.out.println(pq.peek());
//        System.out.println(pq.poll());
//        System.out.println(pq.peek());
        System.out.println(pq.remove(54));

        Object[] ints = pq.toArray();
        for (Object num: ints) {
            System.out.println(num);
        }

        //System.out.println(pq.peek());
        pq.add(-1);
        //System.out.println(pq.peek());
    }
}
