

public class CommonCharacterCount {

  public static void main(String args[]){
    String s1 = "aabcc", s2 = "adcaa";
    PlaygroundJava.printLine(commonCharacterCount(s1,s2));
  }

  static int commonCharacterCount(String s1, String s2){
    int count = 0;

    for(int i = 0; i<s1.length(); ++i){
      if(s2.contains(String.valueOf(s1.charAt(i)))){
        ++count;
        s2= s2.replaceFirst(String.valueOf(s1.charAt(i)),"");
      }
    }
    return count;
  }
}
