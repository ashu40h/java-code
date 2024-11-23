import java.util.*;

public class MyClass {
  
  
  public static void main(String[] args){
     
     String ascendingOrderString = "ashusharma";
     
     String result=reverseAString(ascendingOrderString.toCharArray());
    
         System.out.println(result);
     
  }
  
  public static String reverseAString(char[] chars){
      String result = "";
      
      for(int i=chars.length-1; i>=0; i--){
        result += chars[i];
      }
      
      return result;
  }
  
}
