
public class ArrayChangeJava{


  public static void main(String args[]){
    int[] n = new int[] {-9999};
    PlaygroundJava.printLine(arrayChange(n));
  }

  static long arrayChange(int[] list) {
    long count = 0;
    for(int i = 1; i<list.length;++i){
      while(list[i]<=list[i-1]){
        ++list[i];
        ++count;
      }
    }
    return count;
  }
}
