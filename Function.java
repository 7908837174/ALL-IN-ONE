import java.util.Scanner;

public class Function { 
    public static String invertBinary(String binaryString) {
        StringBuilder inverted = new StringBuilder();
        for (char bit : binaryString.toCharArray()) {
            if (bit == '1') {
                inverted.append('0');
            } else if (bit == '0') {
                inverted.append('1');
            }
        }
        return inverted.toString();
    }

    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
 
        System.out.print("Enter a binary number (n1): ");
        String n1 = scanner.nextLine();

        System.out.print("Enter another binary number (n2): ");
        String n2 = scanner.nextLine();
 
        String invertedN1 = invertBinary(n1);
        String invertedN2 = invertBinary(n2);
 
        System.out.println("Original n1: " + n1 + " => Inverted n1: " + invertedN1);
        System.out.println("Original n2: " + n2 + " => Inverted n2: " + invertedN2);
 
        scanner.close();
    }
}
