 public class StackArray {
   private int[] stack;
   private int top;
   private int capacity;
 
public StackArray(int capacity){
     this.capacity = capacity;
     stack = new int [capacity];
     top = -1;
}
public void push(int value){
     if(top == capacity-1){
          throw new StackOverflowError("Stack Is full , do not push any element.");
     }
     stack[++top]=value;
}
public int pop(){
     if (isEmpty()){
          throw new IllegalAccessError("Stack is Empty , can not pop");
     }
     return stack[top--];
}
public int peek() {
   if(isEmpty()){
     throw new IllegalAccessError("Stack is Empty , can not peek");
   }
   return stack[top];
}
public Boolean isEmpty(){
     return top == -1;
}
public int size(){
     return top+1;
}
public static void main(String[] args) {
     StackArray stack=new StackArray(5);
     stack.push(12);
     stack.push(15);
     stack.push(14);
     stack.push(17);
     stack.push(19);
     System.out.println("Top element (peek): " + stack.peek());  // 40
     System.out.println("Stack size: " + stack.size());           // 4
 
     
     System.out.println("Popped element: " + stack.pop());  // 40
     System.out.println("Popped element: " + stack.pop());  // 30
 

     System.out.println("Is stack empty? " + stack.isEmpty()); // false
 
     System.out.println("Top element after popping: " + stack.peek());  // 20
 
     stack.pop();
     stack.pop();
 
     System.out.println("Is stack empty now? " + stack.isEmpty());  // true
 
 }
}

 