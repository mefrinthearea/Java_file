class data {
  public static void main(String[] args){
   /* 
      In Java, data types are categorized into two main types:

      1. Primitive Data Types:
         - Built-in types in Java
         - Store simple values
         - Total of 8 types: byte, short, int, long, float, double, char, boolean
         - Fixed size and predefined behavior

      2. Non-Primitive (Reference) Data Types:
         - Created by programmers (e.g., Classes, Arrays, Strings, Interfaces)
         - Can store multiple values or objects
         - Larger and more complex than primitives
    */

    //integer types
    byte aSingleByte = 100;         //byte -128 to 127
    short aSmallNumber = 20000;    //short -32,768 to 32,767
    int anInteger = 2147483647;   //-2147483648 to 2147483647
    long aLargeNumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807.   L or l at the end of the number

    //decimal types
    double aDouble = 1.79769313; //4.9E-324 to 1.79769311348623157E308
    float aFloat = 3.4028F;     //1.4e-45 to 3.4028235E38. F or f at the end

    //booleans
    boolean isWeekend = false;
    boolean isWorkday = true;

    //charactes
    char copyrightSymbol = '\u00A9';

    System.out.println("This is the copyright symbol: " + copyrightSymbol);

    int number1 = 5;
    double number2 = number1; //instead of 5 it will show 5.00

    System.out.println(number2); 

    /* lets try inverse
    double number3 = 5.5;
    int number4 = number3;
        THIS WILL FAIL

    System.out.println(number4); 
    */

    double number3 = 5.5;
    int number4 = (int)number3;

    System.out.println(number4); 
  }
}