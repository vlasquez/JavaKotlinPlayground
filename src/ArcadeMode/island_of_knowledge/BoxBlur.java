package ArcadeMode.island_of_knowledge;

import java.util.ArrayList;
import java.util.List;

public class BoxBlur {
  public static void main(String[] args){
    int[][] test = new int[4][4];
    test[0][0]= 7;
    test[0][1]= 4;
    test[0][2]= 0;
    test[0][3]= 1;
    test[1][0]= 5;
    test[1][1]= 6;
    test[1][2]= 2;
    test[1][3]= 2;
    test[2][0]= 6;
    test[2][1]= 10;
    test[2][2]= 7;
    test[2][3]= 8;
    test[3][0]= 1;
    test[3][1]= 4;
    test[3][2]= 2;
    test[3][3]= 0;

    boxBlur(test);
  }

  public static int[][] boxBlur(int[][] image){
    List<Integer> res = new ArrayList<Integer>();
      for(int i = 0; i<image.length;++i){
        for(int j  =0; j<image[i].length;++j){

        }
      }
    return null;
    }
}
