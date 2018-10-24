public class halvingSum {

  public static void main(String args[]){
    int a = 4, b = 13, n = 25;
    PlaygroundJava.printLine(halvingSum(n));
  }

  static int halvingSum(int n) {
    int res = 0;
    int i = 1;
    while(n>=1){
      res+=n;
      n = Math.round(n/2);
    }
    return res;
  }
}
