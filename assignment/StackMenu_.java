package assignment;

import java.util.Scanner;

public class StackMenu_ {

    static interface IStack{
        void push(int x);
        void pop();
        boolean isStackEmpty();
        boolean isStackFull();
    }

    static class Stack implements Stack_.IStack {

        private int arr[];
        private int top;
        private int size;

        //initialize size
        public Stack(int size) {
            arr = new int[size];
            top=-1;
            this.size=size;
        }
        //push
        public void push(int x) {
            if(!isStackFull()){
                top++;
                arr[top] = x;
            }
        }
        //return top
        public int top() {
            if(isStackEmpty()) return -1;
            return arr[top];
        }

        //pop
        public void pop() {
            if(!isStackEmpty()) {
                top--;
            }
        }

        //check if empty
        public boolean isStackEmpty() {
            if(top == -1) {
                return true;
            }
            return false;
        }
        //check if full
        public boolean isStackFull() {
            if(size-1 == top) {
                return true;
            }
            return false;
        }

        //display
        public void display() {
            if(isStackEmpty()) return;

            int top = top();
            pop();
            System.out.println(top);
            display();
            push(top);
        }

    }

    public static void main(String[] args) {
        Stack st=new Stack(10);
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
