import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrderArray {
  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>();
    list.add(3);
    list.add(7);
    list.add(6);
    list.add(1);
    list.add(9);
    list.add(5);
    list.add(8);
    list.add(2);
    list.add(4);
    list.add(10);


    //System.out.println(matrixElementsSum(multi));
    //System.out.println(champernowneDigit(11));
    System.out.println(order(list));
  }

  public static List<Integer> order(List<Integer>unsorted){
     Collections.sort(unsorted);

    return unsorted;
  }
}
