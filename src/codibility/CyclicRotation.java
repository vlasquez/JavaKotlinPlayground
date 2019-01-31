package codibility;

public class CyclicRotation {

  public static void main(String[] args) {
    int[] a = new int[]{3,8,9,7,6};
    cyclicRotation(a,3);
  }

  public static int[] cyclicRotation(int[] a,int k){
    if(a.length<=0){
      return a;
    }
    int size = a.length;
    int[]b = new int[size];

    k%=size;

    for (int i = 0; i<size-k; i++){
      b[k+i]=a[i];
    }
    for(int i = 0;i<k;++i){
      b[i] = a[size-k+i];
    }
    return b;
  }
}
