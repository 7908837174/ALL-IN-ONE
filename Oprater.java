import java.util.*;

class Operator {
    public static void main(String[] args) {
        String str = "((2+1)*3)";
        solve(str);
    }

    public static void solve(String str) {
        Stack<Character> operator = new Stack<>();
        Stack<Integer> operand = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(') {
                operator.push(ch);
            } else if (Character.isDigit(ch)) {
                operand.push(ch - '0');
            } else if (ch == ')') {
                while (operator.peek() != '(') {
                    char opr = operator.pop();
                    int b = operand.pop();
                    int a = operand.pop();
                    int ans = performOperation(a, b, opr);
                    operand.push(ans);
                }
                operator.pop(); // Pop the '('
            } else {
                while (!operator.isEmpty() && operator.peek() != '(' && priorityCheck(operator.peek()) >= priorityCheck(ch)) {
                    char opr = operator.pop();
                    int b = operand.pop();
                    int a = operand.pop();
                    int ans = performOperation(a, b, opr);
                    operand.push(ans);
                }
                operator.push(ch);
            }
        }

        while (!operator.isEmpty()) {
            char opr = operator.pop();
            int b = operand.pop();
            int a = operand.pop();
            int ans = performOperation(a, b, opr);
            operand.push(ans);
        }

        System.out.println(operand.peek());
    }

    public static int performOperation(int a, int b, char ch) {
        switch (ch) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                return a / b;
            default:
                return 0;
        }
    }

    public static int priorityCheck(char ch) {
        if (ch == '+' || ch == '-') {
            return 1;
        } else if (ch == '*' || ch == '/') {
            return 2;
        }
        return -1;
    }
}
// 9

