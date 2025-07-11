import java.util.*;

import StackLinklist.stack;
public class Stack {

    public static class pusfAtBottom(int data, Stack<Integer> s) {
    if(s.isEmpty()){
        s.push(data);
        return;
    }
        int top =s.pop();
        pushAtBottom(data, s);
        s.push(top); 
    }

    public static void reverse(Stack<Inreger> s){
        if(isEmpty()){
            return;
        }
        int top = s.pop();
        reverse(s);
        pushAtBottom(top, s);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();


    }
    while(!s.isEmpty()){
        System.out.println(s.peek);
        s.pop();
    }
}



