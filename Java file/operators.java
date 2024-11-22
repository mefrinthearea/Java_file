class operators {
  public static void main(String[] args) {
    int number1 = 12;
    int number2 = 6;
    double number3 = 12;
    double number4 = 5;
    int number5 = 12;
    double number6 = 5;

    //addition 
    System.out.println(number1 + number2); //18

    //substraction
    System.out.println(number1 - number2); //6
    System.out.println(number2 - number1); //-6

    //multiplication
    System.out.println(number1 * number2); //72

    //division
    System.out.println(number1 / number2); //2
    System.out.println(number2 / number1); //0
    System.out.println(number3 / number4); //2.4
    System.out.println(number5 / number6); //2.4


    
    //remainder (modulus)
    System.out.println(number1 % number2); //0

    int number = 20;

    // number = number +5
    number += 5;

    System.out.println(number); //25

    number -= 5;
    System.out.println(number); //20

    number %= 2;
    System.out.println(number); //0

  }
}
 