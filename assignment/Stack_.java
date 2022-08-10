package assignment;

import java.util.Scanner;

public class Stack_ {


    static interface IStack{
        void push(int x);
        void pop();
        boolean isStackEmpty();
        boolean isStackFull();
    }

    static class Stack implements IStack{

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

        System.out.println("Written By Yash");
        Stack st=new Stack(10);
        Scanner sc=new Scanner(System.in);

        System.out.println("Stack full: "+st.isStackFull());
        System.out.println("Stack Empty: "+st.isStackEmpty());
        st.push(4);

        st.push(3);
        st.push(2);
        st.push(2);
        st.push(1);
        st.push(0);

        st.display();

        System.out.println("Stack top: "+st.top());
    }
}
