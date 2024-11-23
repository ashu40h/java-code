import java.util.*;

public class MyClass {
  
  
  public static void main(String[] args){
     
     int[] duplicateElementsArray = {2,3,2,3,4,5,6};
     
     int[] result=setTypeArray(duplicateElementsArray);
     for(int i=0; i<result.length; i++){
         System.out.println(result[i]);
     }
  }
  
  public static int[] setTypeArray(int[] array){
      int[] result = new int[array.length];
      
      int prefixSum=0;
      int sumResult=0;
      if(array[0]!=array[1]){
      prefixSum=array[0]+array[1];
      sumResult =prefixSum;
      result[0]=array[0];
      result[1]=array[1];
      }
      int j=2;
      for(int i=2; i<array.length; i++){
          prefixSum = prefixSum+array[i]-array[i-2];
          if(sumResult!=prefixSum){
              result[j]=array[i];
              sumResult = prefixSum;
              j++;
          }
          
      }
      
      return result;
  }
  
}
