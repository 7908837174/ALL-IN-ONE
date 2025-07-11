    import java.util.*; 
class Solution {
    public static void Revarsethearray(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        Revarsethearray(arr, start + 1, end - 1);
    }

    public static Stack<Integer> arrayToStack(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        for (int value : arr) {
            stack.push(value);
        }
        return stack;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(arr));

        Revarsethearray(arr, 0, arr.length - 1);
        System.out.println("Reversed Array: " + Arrays.toString(arr));

        Stack<Integer> stack = arrayToStack(arr);
        System.out.println("Stack: " + stack);
    }
}

}
