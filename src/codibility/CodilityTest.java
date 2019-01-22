package codibility; /**
 * @autor Andrés Velasquez
 * @since 1/18/19
 **/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CodilityTest {
  public static void main(String[] args) {
    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    //System.out.println(hailstoneSequence(27));
    int rows = 2;
    String seats = "1A 2F 1C";

    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    System.out.println(task1(rows, seats));
  }

  public static int solution(int[] A) {
    List<Integer> l = new ArrayList<>();
    int e = 1;
    for (int i = 0; i < A.length; ++i) {
      l.add(A[i]);
    }
    for (int element = 1; element < l.size(); element++) {
      if (!l.contains(element)) {
        e = element;
        return e;
      }
    }
    return e + 1;
  }

  public static int task1(int n, String s) {

    int tmp = 0;
    List<String> seatsOccupied=new ArrayList<>();
    String[] strSeats = s.split(" ");

    for(String element: strSeats){
      seatsOccupied.add(element);
    }

    for(int c=1; c<=n; ++c){
      if(!seatsOccupied.contains(c+"A")&& !seatsOccupied.contains(c+"B")&& !seatsOccupied.contains(c+"C")){
        ++tmp;
      }
      if(!seatsOccupied.contains(c+"D")&& !seatsOccupied.contains(c+"E")&& !seatsOccupied.contains(c+"F")&&!seatsOccupied.contains(c+"G")){
        ++tmp;
      }
      if(!seatsOccupied.contains(c+"H")&& !seatsOccupied.contains(c+"J")&& !seatsOccupied.contains(c+"K")){
        ++tmp;
      }
    }
    return tmp;
  }
}
