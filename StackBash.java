 public class StackBash {

    static class Node {
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Stack {
        static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        Stack.push(10);
        Stack.push(20);
        Stack.push(30);

        System.out.println("Top element is: " + Stack.peek());  // 30
        System.out.println("Popped: " + Stack.pop());           // 30
        System.out.println("Popped: " + Stack.pop());           // 20
        System.out.println("Top element is: " + Stack.peek());  // 10
    }
}
