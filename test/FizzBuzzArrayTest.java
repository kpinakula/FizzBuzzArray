import org.junit.Assert;
import org.junit.Test;

public class FizzBuzzArrayTest {
  @Test
  public void returnFizzBuzzSequenceFor15() {
    Assert.assertEquals("3 should return:1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz", "[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", new FizzBuzzArray().main(15));
  }
}
