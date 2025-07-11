 import java.util.Stack;

public class QuqueY {

    static class Ququq {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        // Check if the queue is empty
        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add element to the queue
        public static void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }

            // Push the new element to s1
            s1.push(data);

            // Move everything back to s1 from s2
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove element from the front of the queue
        public static int remove() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.pop();
        }

        // Peek front element
        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return s1.peek();
        }
    }

    // Main method to test the queue
    public static void main(String[] args) {
        Ququq.add(10);
        Ququq.add(20);
        Ququq.add(30);

        System.out.println("Peek: " + Ququq.peek()); // 10

        System.out.println("Removed: " + Ququq.remove()); // 10
        System.out.println("Peek after remove: " + Ququq.peek()); // 20
    }
}
