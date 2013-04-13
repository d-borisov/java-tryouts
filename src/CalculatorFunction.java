@FunctionalInterface
public interface CalculatorFunction<T extends Number> {

  T apply(T a, T b);
}
