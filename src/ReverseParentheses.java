public class ReverseParentheses {
  public static void main(String args[]){
    String s = "a(bcdefghijkl(mno)p)q";
    String s2 = "The ((quick (brown) (fox) jumps over the lazy) dog)";
    PlaygroundJava.printLine(reverseParentheses(s2));
  }

  static String reverseParentheses(String s){
    int start = s.lastIndexOf("(");
    int end = 0;
    String stringInParentheses ;
    StringBuilder reverse = new StringBuilder();
    if(start !=-1){
      for(int c = start; c <s.length(); ++c) {
        if(String.valueOf(s.charAt(c)).equals(")")){
          end = c;
          break;
        }
      }
    }

    if (start != -1 && end != 0){
        stringInParentheses = s.substring(start+1,end);
        for (int i = stringInParentheses.length() -1 ;i >= 0; --i) {
          reverse.append(String.valueOf(stringInParentheses.charAt(i)));
        }
        s = s.replace("("+stringInParentheses+")",reverse);
        return reverseParentheses(s);
      }
      else{
        return s;
      }
  }
}
