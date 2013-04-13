public class Calculator {

  public static final CalculatorFunction<Integer> SUM = (x, y) -> x + y;
  public static final CalculatorFunction<Integer> MULTI = (x, y) -> x * y;
  public static final CalculatorFunction<Integer> DIFFERENCE = (x, y) -> x - y;
  public static final CalculatorFunction<Integer> DIVISION = (x, y) -> x / y;

}
