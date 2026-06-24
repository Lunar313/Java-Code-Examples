package examples;

/**
 * A simple Hello World program demonstrating basic Java concepts.
 * 
 * Best Practices Demonstrated:
 * - Class names should be in PascalCase (e.g., HelloWorld)
 * - Always add meaningful Javadoc comments
 * - Keep your main method clean and simple
 */
public class HelloWorld {

    /**
     * Main entry point of the application.
     * 
     * @param args command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        String greeting = "Hello, World!";
        System.out.println(greeting);
        
        // Using a method to keep code organized
        printWelcomeMessage();
    }
    
    /**
     * Prints a welcome message to the console.
     * 
     * Tip: Breaking code into smaller methods improves readability
     * and makes testing easier.
     */
    private static void printWelcomeMessage() {
        System.out.println("Welcome to Java programming!");
        System.out.println("Keep coding and learning every day.");
    }
}
