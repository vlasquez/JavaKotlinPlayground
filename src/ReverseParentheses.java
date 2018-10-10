public class ReverseParentheses {
  public static void main(String args[]){
    String s = "a(bcdefghijkl(mno)p)q";
    String s2 = "co(de(fight)s)";
    PlaygroundJava.printLine(reverseParentheses(s2));
  }

  static String reverseParentheses(String s){
    String[] split = s.split("[\\(||\\)]");

    return s;
  }
}
