package ass_class_2;

import java.util.Scanner;

public class _31 {

    static interface IQueue{
        void push(int x);
        void pop();
        boolean isQueueEmpty();
        boolean isQueueFull();
    }

    static class Queue implements IQueue {

        private int arr[];
        private int front;
        private int rear;
        private int size;

        //initialize size
        public Queue(int size) {
            arr = new int[size];
            front=rear=-1;
            this.size=size;
        }
        //push
        public void push(int x) {
            if(!isQueueFull()){
                rear++;
                arr[rear] = x;
            }
        }
        //return top
        public int top() {
            if(isQueueEmpty()) return -1;
            return arr[front];
        }

        //pop
        public void pop() {
            if(!isQueueEmpty()) {
                front++;
            }
        }

        //check if empty
        public boolean isQueueEmpty() {
            if(front == rear) {
                return true;
            }
            return false;
        }
        //check if full
        public boolean isQueueFull() {
            if(size-1 == rear) {
                return true;
            }
            return false;
        }

        //display
        public void display() {
            if(isQueueEmpty()) return;
            for(int i:arr) System.out.println(i+" ");
        }

    }

    public static void main(String[] args) {
        Queue st=new Queue(10);
        Scanner sc=new Scanner(System.in);
        int ch;
        boolean cont = true;

        while(cont) {
            System.out.println("choice 1 push \nchoice 2 pop \nchoice 3 display \nchoice 4 terminate\nchoose any one: ");
            ch=sc.nextInt();

            switch(ch) {
                case 1:
                    System.out.println("No. ? ");
                    st.push(sc.nextInt());
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.display();
                    break;
                case 4:
                    cont=false;
                    break;
                default:
                    System.out.println("Select between 1 to 4....");
            }

            System.out.println("Thanks");
        }
    }
}
