package Tournaments;

import Main.PlaygroundJava;

public class AddDigits {

  public static void main(String args[]){
    int a = 4, b = 13, n = 10;
    PlaygroundJava.printLine(addDigits(a,b,n));
  }

  static String addDigits(long a, int b, int n) {

    String s ="";
    while(n>0){

      for(int i = 9;i>=0;i--){
        if(Long.parseLong(a+""+i+"")%b==0){
          s=a+""+i+"";
          a = Long.parseLong(s);
          break;
        }
      }

      --n;
    }
    return a+"";
  }
}
