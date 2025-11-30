package examples;

/**
 * A simple Calculator class demonstrating object-oriented principles.
 * 
 * Best Practices Demonstrated:
 * - Encapsulation: using private fields with public methods
 * - Method naming: use verbs in camelCase (e.g., add, subtract)
 * - Input validation: always validate method parameters
 * - Single Responsibility: each method does one thing
 */
public class Calculator {

    /**
     * Adds two numbers together.
     * 
     * @param a the first number
     * @param b the second number
     * @return the sum of a and b
     */
    public int add(int a, int b) {
        return a + b;
    }

    /**
     * Subtracts the second number from the first.
     * 
     * @param a the first number
     * @param b the number to subtract
     * @return the difference (a - b)
     */
    public int subtract(int a, int b) {
        return a - b;
    }

    /**
     * Multiplies two numbers.
     * 
     * @param a the first number
     * @param b the second number
     * @return the product of a and b
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /**
     * Divides the first number by the second.
     * 
     * @param a the dividend
     * @param b the divisor
     * @return the quotient (a / b)
     * @throws IllegalArgumentException if b is zero
     */
    public double divide(int a, int b) {
        // Tip: Always validate inputs to prevent runtime errors
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return (double) a / b;
    }

    /**
     * Main method to demonstrate calculator usage.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        System.out.println("Calculator Examples:");
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
        System.out.println("6 * 7 = " + calc.multiply(6, 7));
        System.out.println("15 / 3 = " + calc.divide(15, 3));
        
        // Demonstrating exception handling
        try {
            calc.divide(10, 0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error caught: " + e.getMessage());
        }
    }
}
