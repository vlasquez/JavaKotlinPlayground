package codibility;

public class OddArray {
  public static void main(String[] args) {

    int[] binary = new int[] {9, 3, 9, 3, 9, 7, 9};

    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    System.out.println(solution(binary));
  }

  public static long solution(int[] n) {
    if(n.length==1){
      return n[0];
    }
    int elem = 0;

    for (int i = 0; i < n.length; i++) {
      elem = elem ^ n[i];
    }
    return elem;
   }
   /*
   		int elem = 0;

		for (int i = 0; i < A.length; i++) {
			elem ^= A[i];
		}
		return elem;
    */
}

