package ArcadeMode.smooth_sailing;

import Main.PlaygroundJava;

public class IsLucky {

  public static void main(String args[]){
    int n = 1230;
    PlaygroundJava.printLine(isLucky(n));
  }

  static boolean isLucky(int n){
    boolean isLucky = false;

    String number = Integer.toString(n);
    int a = 0,b = 0;
    for(int i = 0; i<number.length()/2; ++i){
      a+= Integer.parseInt(String.valueOf(number.charAt(i)));
    }
    for(int j = number.length()-1; j>=number.length()/2; --j){
      b +=Integer.parseInt(String.valueOf(number.charAt(j)));
    }
    if(a == b){
      isLucky = true;
    }
    return isLucky;

  }

  static boolean isLuckyFast(int n){
    String s = n+"";
    int sum = 0;

    for(int i=0; i<s.length()/2; i++)
      sum+=(s.charAt(i)-s.charAt(s.length()-1-i));

    return sum==0;
  }
}
