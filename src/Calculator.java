public class Calculator {

    // Add two numbers
    public int add(int a, int b) {
        return a + b; // resolved version
    }

    // Subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Multiply two numbers
    public int multiply(int a, int b) {
        return a * b;
    }

    // Divide two numbers
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return a / b;
    }

    // Optional test method
    public void testCalculator() {
        System.out.println("Add 5 + 3 = " + add(5, 3));
        System.out.println("Subtract 5 - 3 = " + subtract(5, 3));
        System.out.println("Multiply 5 * 3 = " + multiply(5, 3));
        System.out.println("Divide 6 / 3 = " + divide(6, 3));
    }
}
