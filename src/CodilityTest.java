import java.util.ArrayList;
import java.util.List;

public class CodilityTest {
  public static void main(String [] args)
  {

    int[] multi = new int[]{-1, -3};

    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    System.out.println(solution(multi));
  }
  public static int solution(int[] A) {
    List<Integer> l = new ArrayList<>();
    int e = 1;
    for (int i = 0; i <A.length; ++i) {
      l.add(A[i]);
    }
    for( int element = 1;element<l.size();element++ ){
      if(!l.contains(element)){
        e= element;
        return e;
      }

    }
    return e+1;
  }
}
