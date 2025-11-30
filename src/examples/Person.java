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
     */
    public Person(String name, int age) {
        this.name = name;
        setAge(age); // Using setter for validation
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
     */
    public void setName(String name) {
        // Tip: Validate input in setters
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        }
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
     */
    public void setAge(int age) {
        // Tip: Protect against invalid data
        if (age >= 0) {
            this.age = age;
        }
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
        
        // Demonstrating validation (negative age won't be set)
        person2.setAge(-5);
        System.out.println("After invalid age update: " + person2);
    }
}
