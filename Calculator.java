public class Calculator{

  /* 
  This calculator performs basic arithmetic. 
  It was built by Audrey for the Codecademy course Learn Java through a guided practice on 07/28/2024.
  Struggles: recalling proper definition of methods, following the flow of data through those methods
  Follow Up: spend time practicing recall of basic method uses, their formats, and data flow before moving on to the next major topic
  */

  public Calculator() {

  }
  
  public int add(int a, int b){
    return a + b;
  }

  public int subtract(int a, int b){
    return a - b;
  }

  public int multiply(int a, int b){
    return a * b;
  }

  public int divide(int a, int b){
    return a / b;
  }

  public int modulo(int a, int b){
    return a % b;
  }

  public static void main(String[] args){
    Calculator myCalculator = new Calculator ();

    System.out.println(myCalculator.add(5, 7));
    System.out.println(myCalculator.subtract(45, 11));
    System.out.println(myCalculator.multiply(21, 7));
    System.out.println(myCalculator.divide(93, 4));
    System.out.println(myCalculator.modulo(93, 4));
  }


}
