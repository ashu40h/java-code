import java.util.*;

public class MyClass {
  
  
  public static void main(String[] args){
     
     int number1 = 23;
     int number2 = 34;
     
     swapTwoNumberWithoutThirdVariable(number1,number2);
     
  }
  
  public static void swapTwoNumberWithoutThirdVariable(int first, int second){
      
      first = first + second;
      second = first - second;
      first = first - second;
      System.out.print("First number value "+ first + ", Second number value "+ second);
     
  }
  
}
