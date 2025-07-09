#include<iostream>
using namespace std;

// Function declarations for calculator operations
float add(float a, float b);
float subtract(float a, float b);
float multiply(float a, float b);
float divide(float a, float b);
int modulus(int a, int b);
float power(float base, int exponent);
void displayMenu();
void demonstrateOperations();

// Function definitions
float add(float a, float b) {
    return a + b;
}

float subtract(float a, float b) {
    return a - b;
}

float multiply(float a, float b) {
    return a * b;
}

float divide(float a, float b) {
    if (b != 0) {
        return a / b;
    } else {
        cout << "Error: Division by zero!" << endl;
        return 0;
    }
}

int modulus(int a, int b) {
    if (b != 0) {
        return a % b;
    } else {
        cout << "Error: Modulus by zero!" << endl;
        return 0;
    }
}

float power(float base, int exponent) {
    float result = 1;
    for (int i = 0; i < exponent; i++) {
        result *= base;
    }
    return result;
}

void displayMenu() {
    cout << "\n=== CALCULATOR MENU ===" << endl;
    cout << "1. Addition (+)" << endl;
    cout << "2. Subtraction (-)" << endl;
    cout << "3. Multiplication (*)" << endl;
    cout << "4. Division (/)" << endl;
    cout << "5. Modulus (%)" << endl;
    cout << "6. Power (^)" << endl;
    cout << "7. Demonstrate Operations" << endl;
    cout << "8. Square a number" << endl;
    cout << "0. Exit" << endl;
    cout << "Choose an operation: ";
}

void demonstrateOperations() {
    cout << "\n=== DEMONSTRATION WITH x=5 ===" << endl;
    int x = 5;

    cout << "Initial value: " << x << endl;

    x = x + 1;
    cout << "After x = x + 1: " << x << endl;

    x += 1;
    cout << "After x += 1: " << x << endl;

    x -= 3;
    cout << "After x -= 3: " << x << endl;

    x *= 2;
    cout << "After x *= 2: " << x << endl;

    x /= 2;
    cout << "After x /= 2: " << x << endl;

    x %= 4;
    cout << "After x %= 4: " << x << endl;

    cout << "\n=== BASIC OPERATIONS WITH x=5, y=4 ===" << endl;
    int a = 5, b = 4;
    cout << a << " + " << b << " = " << add(a, b) << endl;
    cout << a << " - " << b << " = " << subtract(a, b) << endl;
    cout << a << " * " << b << " = " << multiply(a, b) << endl;
    cout << a << " / " << b << " = " << divide(a, b) << endl;
}

int main() {
    int choice;
    float num1, num2, result;
    int int1, int2;

    cout << "Welcome to the Advanced Calculator!" << endl;

    do {
        displayMenu();
        cin >> choice;

        switch(choice) {
            case 1: // Addition
                cout << "Enter two numbers: ";
                cin >> num1 >> num2;
                result = add(num1, num2);
                cout << num1 << " + " << num2 << " = " << result << endl;
                break;

            case 2: // Subtraction
                cout << "Enter two numbers: ";
                cin >> num1 >> num2;
                result = subtract(num1, num2);
                cout << num1 << " - " << num2 << " = " << result << endl;
                break;

            case 3: // Multiplication
                cout << "Enter two numbers: ";
                cin >> num1 >> num2;
                result = multiply(num1, num2);
                cout << num1 << " * " << num2 << " = " << result << endl;
                break;

            case 4: // Division
                cout << "Enter two numbers: ";
                cin >> num1 >> num2;
                result = divide(num1, num2);
                if (num2 != 0) {
                    cout << num1 << " / " << num2 << " = " << result << endl;
                }
                break;

            case 5: // Modulus
                cout << "Enter two integers: ";
                cin >> int1 >> int2;
                result = modulus(int1, int2);
                if (int2 != 0) {
                    cout << int1 << " % " << int2 << " = " << result << endl;
                }
                break;

            case 6: // Power
                cout << "Enter base and exponent: ";
                cin >> num1 >> int2;
                result = power(num1, int2);
                cout << num1 << " ^ " << int2 << " = " << result << endl;
                break;

            case 7: // Demonstrate operations
                demonstrateOperations();
                break;

            case 8: // Square a number (original functionality)
                cout << "Enter a number to square: ";
                cin >> num1;
                result = multiply(num1, num1);
                cout << "Square of " << num1 << " = " << result << endl;
                break;

            case 0: // Exit
                cout << "Thank you for using the calculator!" << endl;
                break;

            default:
                cout << "Invalid choice! Please try again." << endl;
        }

    } while(choice != 0);

    return 0;
}