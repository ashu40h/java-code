import java.util.ArrayList;
import java.util.List;

class Scratch {
    public static void main(String[] args) {
        int number = 20;
        List<Integer> result = printFabSeries(number);
        System.out.println(result);
    }

    public static List<Integer> printFabSeries(int number){
        List<Integer> result = new ArrayList<>();
        result.add(0);
        result.add(1);
        for(int i=2; i<number; i++){
           result.add(result.get(i-1) + result.get(i-2));
        }
        return result;
          }

}
