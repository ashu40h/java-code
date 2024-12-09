import java.util.*;
class Main {
    public static void main(String[] args) {
    int number = 83;
   for(int i=0; i<100; i++){
       
       if(checkPrimeNumber(i)){
           System.out.print(i+ " ");
       }
       
   }
}

  private static boolean checkPrimeNumber(int number){
      
       if(number <=1){
        return false;
       }
       if(number==2){
           return true;
       }
       if(number%2==0){
           return false;
       }
    
    for(int i=3; i<=Math.sqrt(number); i += 2 ){
        if(number%i==0){
            return false;
        }
    }
    return true;
  }
}
