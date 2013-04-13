import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class CalculatorTest {

  @Test
  public void test_functions() throws Exception {
    assertFunc(6, 2, Calculator.SUM, 8);
    assertFunc(6, 2, Calculator.DIFFERENCE, 4);
    assertFunc(6, 2, Calculator.DIVISION, 3);
    assertFunc(6, 2, Calculator.MULTI, 12);
  }

  @Test
  public void test_library_functions() throws Exception {
    assertFunc(6., 2., Math::pow, 36.);
    assertFunc(6., 2., Math::max, 6.);
  }

  @Test
  public void test_custom_functions() throws Exception {
    assertFunc(6, 2, CalculatorTest::someCustomFunction, 6);
    assertFunc(6, 2, (x, y) -> y, 2);
  }

  private static <T extends Number> T someCustomFunction(T a, T b) {
    return a;
  }

  private static <T extends Number> void assertFunc(T a, T b, CalculatorFunction<T> func, T c) {
    assertThat(func.apply(a, b), is(c));
  }

}
