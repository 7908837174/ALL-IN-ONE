import java.util.*; 
class StackMiddleInsertion {
    public static void pushInMiddle(Stack<Integer> stack, int element) {
        int size = stack.size();
        insertInMiddle(stack, element, size / 2);
    }

    private static void insertInMiddle(Stack<Integer> stack, int element, int position) {
        if (position == 0) {
            stack.push(element);
            return;
        }
        int top = stack.pop();
        insertInMiddle(stack, element, position - 1);
        stack.push(top);
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        System.out.println("Original Stack: " + stack);

        pushInMiddle(stack, 99);

        System.out.println("Stack after pushing in the middle: " + stack);
    }
}
