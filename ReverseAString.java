import java.util.*;
class Main {
    public static void main(String[] args) {
        String name="ashu";
        
       
        
        
        System.out.println("Try programiz.pro -" + reverseAString(name));
    }

  private static String reverseAString(String string){
   char[] chars = string.toCharArray();
        StringBuilder reverse = new StringBuilder();
        for(int i=string.length()-1; i>=0; i--){
            reverse.append(chars[i]);
        }
    return reverse.toString();
  }
}
