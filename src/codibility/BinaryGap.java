package codibility;

public class BinaryGap {
  public static void main(String [] args)
  {

    int binary = 1376796946;

    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    System.out.println(solution(binary));
  }
  public static int solution(int n) {
    String bin = Integer.toBinaryString(n);
    int count = 0, tmp = 0;
    for(char c : bin.toCharArray()){
      if(c=='0'){
        ++tmp;
      }
      else{
        if(count<tmp) {
          count = tmp;
        }
        tmp = 0;
      }
    }
    return count;
  }
}
