public class age {
  public static void main(String[] args) {
    /* 
      Logical Operators in Java:
      Logical operators are used to perform logical operations on boolean expressions.

      1. AND (&&): Returns true if both conditions are true.
         - Syntax: condition1 && condition2
         - Example: age >= 18 && age <= 40

      2. OR (||): Returns true if at least one condition is true.
         - Syntax: condition1 || condition2
         - Example: isStudent || isLibraryMember

      3. NOT (!): Reverses the value of a boolean.
         - Syntax: !condition
         - Example: !isStudent
    */

    // Example 1: AND (&&) Operator
    int age = 25; // Declare and initialize age
    // Check if age is between 18 and 40
    boolean isAdultInRange = age >= 18 && age <= 40;
    System.out.println("Is age between 18 and 40? " + isAdultInRange);

    // Example 2: OR (||) Operator
    boolean isStudent = false;
    boolean isLibraryMember = true;
    // Check if the person is a student or a library member
    boolean canAccessLibrary = isStudent || isLibraryMember;
    System.out.println("Can access library: " + canAccessLibrary);

    // Additional Example: Check if age is eligible for child or senior discounts
    boolean isChild = age <= 12;
    boolean isSenior = age >= 65;
    boolean getsDiscount = isChild || isSenior;
    System.out.println("Eligible for discount: " + getsDiscount);

    // Example 3: NOT (!) Operator
    // Reverse the value of a boolean
    boolean notStudent = !isStudent;
    System.out.println("Is not a student: " + notStudent);
  }
}
