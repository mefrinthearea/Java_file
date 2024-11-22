class variables {
  // Class-level variables (default values are assigned automatically)
  static int defaultInt; // Default value: 0
  static String defaultString; // Default value: null

  public static void main(String[] args) {
    // 1. Declaring and Initializing Variables
    int age; // Declared variable of type int
    age = 18; // Assigned a value
    age = 40; // Value can be changed (mutable)
    System.out.println("I am " + age + " years old.");

    // 2. Declaring and Initializing in a Single Line
    double height = 5.9; // Declared and initialized in one line
    System.out.println("My height is " + height + " feet.");

    // 3. Multiple Variables of the Same Type
    int x = 5, y = 10, z = 15; // Declare and initialize multiple variables
    System.out.println("x = " + x + ", y = " + y + ", z = " + z);

    // 4. Constant Variables (Final)
    final int birthYear = 1984; // Declared as a constant, value cannot be changed
    System.out.println("I was born in " + birthYear);
    // birthYear = 1990; // This would cause an error!

    // 5. Variable Types: Primitive vs Reference
    boolean isStudent = true; // A primitive variable
    String name = "John Doe"; // A reference variable (String is an object)
    System.out.println("Name: " + name + ", Is Student: " + isStudent);

    // 6. Variable Scope
    { // This is a new block
      int blockVariable = 50; // Scope is limited to this block
      System.out.println("Block Variable: " + blockVariable);
    }
    // System.out.println(blockVariable); // This would cause an error!

    // 7. Default Values for Class-Level Variables
    // Demonstrating default values of static variables
    System.out.println("Default int value: " + defaultInt);
    System.out.println("Default String value: " + defaultString);

    // 8. Type Casting (Implicit and Explicit)
    int number = 100;
    double largeNumber = number; // Implicit casting (int to double)
    System.out.println("Implicit Casting: " + largeNumber);

    double decimal = 99.99;
    int wholeNumber = (int) decimal; // Explicit casting (double to int)
    System.out.println("Explicit Casting (truncated): " + wholeNumber);

    // 9. Special Variable Types
    String auto = "Automatic type inference with explicit type declaration"; 
    // Use `var` if you're on Java 10 or later
    System.out.println(auto);

    // 10. Arithmetic Operations on Variables
    int a = 10, b = 20;
    int sum = a + b; // Adding two variables
    System.out.println("Sum of a and b: " + sum);

    int product = a * b; // Multiplying two variables
    System.out.println("Product of a and b: " + product);

    // Example to demonstrate mutable behavior
    age = age + 10; // Changing age again
    System.out.println("Updated age: " + age);
  }
}
