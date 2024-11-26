import java.util.ArrayList;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        String string = "assdkfsjas";
        boolean result = isStringPallindrone(string.toCharArray());
        System.out.println(result);
    }

    public static boolean isStringPallindrone(char[] string) {
            boolean status = true;
            int j=0;
       for(int i=0; i<string.length; i++){
           if(string[i]!=string[string.length-1-i]){
            return false;
           }
           j++;
        }
        return status;
    }

}
