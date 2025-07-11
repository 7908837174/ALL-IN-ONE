public class LinkListStack {
 
    static class Node {
        int data;
        Node next;

        Node(int value) {
            data = value;
            next = null;
        }
    }

    private Node top;

    public LinkListStack() {
        top = null;
    }

    public void push(int data) {
        Node n = new Node(data);
        n.next = top;
        top = n;
        System.out.println("Pushed " + data + " into the stack.");
    }

    public void pop() {
        if (top == null) {
            System.out.println("Underflow: Stack is empty.");
            return;
        }
        System.out.println("Popped " + top.data + " from the stack.");
        top = top.next;
    }

    public void peek() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Top element is: " + top.data);
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.println("Stack elements:");
        Node current = top;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public boolean isEmpty() {
        return top == null;
    }

    public int size() {
        int count = 0;
        Node current = top;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }
}



// Pushed 10 into the stack.
// Pushed 20 into the stack.
// Pushed 30 into the stack.
// Pushed 40 into the stack.
// Stack elements:
// 40
// 30
// 20
// 10
// Top element is: 40
// Popped 40 from the stack.
// Popped 30 from the stack.
// Stack elements:
// 20
// 10
// Is stack empty? false
// Stack size: 2
