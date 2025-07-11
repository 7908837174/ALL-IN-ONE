 public class Queue {
    static int[] arr;
    static int size;
    static int front = -1;
    static int rear = -1;

    Queue(int n) {
        arr = new int[n];
        size = n;
    }

    public static boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static boolean isFull() {
        return (rear + 1) % size == front;
    }

    public static void add(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        if (isEmpty()) {
            front = 0;
        }
        rear = (rear + 1) % size;
        arr[rear] = data;
    }

    public static int remove() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        int result = arr[front];
        if (front == rear) {
            // Queue has only one element
            front = rear = -1;
        } else {
            front = (front + 1) % size;
        }
        return result;
    }

    public static int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
        q.add(40);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}
