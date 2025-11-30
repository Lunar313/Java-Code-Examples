package examples;

/**
 * A Person class demonstrating encapsulation and basic OOP concepts.
 * 
 * Best Practices Demonstrated:
 * - Private fields with public getters/setters (encapsulation)
 * - Constructor overloading
 * - Override toString() for meaningful object representation
 * - Use final for fields that shouldn't change after initialization
 */
public class Person {
    
    // Private fields - encapsulation protects data integrity
    private String name;
    private int age;
    
    /**
     * Default constructor.
     * 
     * Tip: Providing a no-argument constructor allows flexibility
     * when creating objects.
     */
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }
    
    /**
     * Parameterized constructor.
     * 
     * @param name the person's name
     * @param age the person's age
     * @throws IllegalArgumentException if name is null/empty or age is negative
     */
    public Person(String name, int age) {
        // Using setters to ensure consistent validation
        setName(name);
        setAge(age);
    }
    
    // Getters and Setters with validation
    
    /**
     * Gets the person's name.
     * 
     * @return the name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Sets the person's name.
     * 
     * @param name the name to set
     * @throws IllegalArgumentException if name is null or empty
     */
    public void setName(String name) {
        // Tip: Validate input in setters and provide clear feedback
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }
    
    /**
     * Gets the person's age.
     * 
     * @return the age
     */
    public int getAge() {
        return age;
    }
    
    /**
     * Sets the person's age.
     * 
     * @param age the age to set (must be non-negative)
     * @throws IllegalArgumentException if age is negative
     */
    public void setAge(int age) {
        // Tip: Protect against invalid data and provide clear feedback
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }
        this.age = age;
    }
    
    /**
     * Returns a string representation of the Person.
     * 
     * Tip: Always override toString() for better debugging
     * and logging.
     * 
     * @return formatted string with person's details
     */
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
    
    /**
     * Main method demonstrating Person class usage.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        // Using default constructor
        Person person1 = new Person();
        System.out.println("Default person: " + person1);
        
        // Using parameterized constructor
        Person person2 = new Person("Alice", 25);
        System.out.println("Created person: " + person2);
        
        // Using setters
        person1.setName("Bob");
        person1.setAge(30);
        System.out.println("Updated person: " + person1);
        
        // Demonstrating validation with exception handling
        try {
            person2.setAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Validation error: " + e.getMessage());
        }
        System.out.println("After invalid age attempt: " + person2);
    }
}
