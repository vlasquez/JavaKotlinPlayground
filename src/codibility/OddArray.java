package codibility;

import java.util.ArrayList;
import java.util.List;

public class OddArray {
  public static void main(String[] args) {

    int[] binary = new int[] {9, 3, 9, 3, 9, 7, 9};

    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    System.out.println(solution(binary));
  }

  public static int solution(int[] n) {
    List<Integer> l2 = new ArrayList<>();
    
    for(int element:n) {
      if(!l2.contains(element)){
        l2.add(element);
      }
      else{
        l2.remove((Object)element);
      }
    }
    return l2.get(0);
  }
}

