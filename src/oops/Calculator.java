package oops;

public class Calculator {
    public int add(int a, int b) {
    return a+b;
    }
    public int add(int a, int b, int c) {
    return a + b + c;
    }
    public double add(double a, double b) {
    return a + b;
    }

  public static void main(String[] args){

        Calculator calc = new Calculator();
      System.out.println(calc.add(  5,4));
      System.out.println(calc.add(  5,4,6));
      System.out.println(calc.add(  2.5,2.4));
  }

}
