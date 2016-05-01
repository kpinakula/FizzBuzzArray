import java.util.Arrays;

public class FizzBuzzArray {
  public static String main(Integer input) {
    String[] myArray = new String[input];
    for(int count=1; count<=input; count++) {
      if (count%15==0) {
        myArray[count-1] = "FizzBuzz";
      }
      else if (count%3==0) {
        myArray[count-1] = "Fizz";
      }
      else if(count%5==0) {
        myArray[count-1] = "Buzz";
      }
      else
        myArray[count-1] = Integer.toString(count);
    }
    //return myArray;
    return Arrays.toString(myArray);
    //return myArray.toString();
  }
}