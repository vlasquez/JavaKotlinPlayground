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
    System.out.println(closest());
  }

  public static List<Integer> order(List<Integer>unsorted){
     Collections.sort(unsorted);

    return unsorted;
  }
  public static int closest(){
    int[] a = new int[]{870,695,790,170,918,932,539,802,648,362,770,884,377,424,845};
    int res= 500000;
    for(int i = 0; i<a.length -1;++i){
      for(int j = 0; j<a.length-1;++j){
        if(i!=j){
          int dif = Math.abs(a[i]-a[j]);
          if(dif<=res){
            res = dif;
          }
        }
      }
    }
    return res;
  }
}
