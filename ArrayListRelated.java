// it will convert an array which includes duplicate values and give a new list without duplicates

import java.util.ArrayList;
import java.util.List;

public class ArrayListRelated {
    public static void main(String[] args){
        List<Integer> series = new ArrayList<>();
        int[] numbers = {1,2,3,3,6,4,3,5,2};

        // find uniques and add to series
        for(int i = 0; i < numbers.length; i++){
            if(!series.contains(numbers[i])){
            series.add(numbers[i]);
            }
        }
        System.out.println(series);
    }    
}
