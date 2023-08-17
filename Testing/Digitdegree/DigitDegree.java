public class DigitDegree {

  public int getDigitDegree(int n) {

    int sum = 0;
    int result=0;

    do {

      sum = sumDigits(n);

      if(sum >= 10) {
        result++;
        n=sum;
      }
  
    } while (sum >= 10);

    return result;
  }

  public int sumDigits(int number) {

    int sum = 0;

    while (number > 0) {
      sum += number % 10;
      number = number / 10;
    }

    return sum;
  }
}