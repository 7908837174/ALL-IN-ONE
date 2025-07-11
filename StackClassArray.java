public class StackClassArray{
    static class Stack {
        int n = 10;                  
        int[] stack = new int[n];  
        int top = -1;         
        
        public void push(int a) {
            if (top == n - 1) {
                System.out.println("Stack Overflow: Cannot push, stack is full.");
                return;
            }
            stack[++top] = a;    
            System.out.println("Element " + a + " pushed into the stack.");
        }

        public void peek() {
            if (top == -1) {
                System.out.println("Stack Underflow: Stack is empty.");
            } else {
                System.out.println("Top element is: " + stack[top]);
            }
        } 
        
        public void display() {
            if (top == -1) {
                System.out.println("Stack is empty.");
                return;
            }
            System.out.println("Elements in the stack:");
            for (int i = top; i >= 0; i--) {
                System.out.println(stack[i]);
            }
        }

        public void pop() {
            if (top == -1) {
                System.out.println("Stack Underflow: Cannot pop from an empty stack.");
                return;
            }
            System.out.println("Popped element: " + stack[top]);
            top--;   
        }

        public boolean isEmpty() {
            return top == -1;   
        }

        public void size() {
            System.out.println("Number of elements in stack: " + (top + 1));
        }
    }

    public static void main(String[] args) { 
        Stack stack = new Stack();  

        stack.push(12);
        stack.push(15);
        stack.push(10);
        stack.push(25);
        stack.push(30);  
        stack.display();

        stack.peek(); 
        stack.pop();
        stack.pop();
        stack.pop();

        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());

        stack.size();
    }
}
