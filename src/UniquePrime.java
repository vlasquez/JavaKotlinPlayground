import java.util.ArrayList;
import java.util.List;

public class UniquePrime {
  public static void main(String args[]){
    int n = 100;
    PlaygroundJava.printLine(primeFactors(n));
  }
  static int[] primeFactors(int n) {
    List<Integer> result = new ArrayList();
    int i = 2;
    while(n !=1){

      if(isPrime(i)){
        if( n%i == 0){
          n = n/i;
          result.add(i);
        }else{
          ++i;
        }
      }
      else{
        ++i;
      }
    }
    return result.stream().mapToInt(Integer::intValue).toArray();
  }

  static boolean isPrime(int number){
    if (number <= 1){
      return false;

    }
    else if( number <= 3){
      return true;
    }
    else if (number % 2 == 0 || number % 3 == 0){
      return false;

    }
    int i = 5;
    while (i * i <= number){
      if (number % i == 0 || number % (i + 2) == 0){
        return false;
      }
      i = i+6;
    }
    return true;
  }
}
