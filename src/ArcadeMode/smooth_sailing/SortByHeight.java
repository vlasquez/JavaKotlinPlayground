package ArcadeMode.smooth_sailing;

import Main.PlaygroundJava;

public class SortByHeight {


  public static void main(String args[]){
    int[] n = new int[] {-1, 150, 190, 170, -1, -1, 160, 180};
    PlaygroundJava.printLine(sortByHeight(n));
  }

  static int[] sortByHeight(int[] array){
    for(int i = 0; i < array.length; ++i){
      if(array[i] != -1){
        for(int j = i+1; j< array.length; j++){
          if(array[i]>array[j] && array[j] !=-1){
            int tmp = array[j];
            array[j] = array[i];
            array[i] = tmp;
          }
        }
      }

    }
    return array;
  }
}
