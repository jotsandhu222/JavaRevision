//this could be done efficiently with arrayList but i was just playing around

public class RemoveDuplicate {
    public static void main(String[] args){
        int[] series = { 1, 2, 2, 3, 3, 3, 4, 5 };
        int elements = series.length;
        
        for(int i = 0; i < series.length-1; i++){
            
            // if element match the other one
            if(series[i]==series[i+1]){
                elements--;
            }
            else{
                continue;
            }
        }

        int[] uniqueSeries = new int[elements];
        int arrIndex = 0;

        for(int i = 0; i < series.length-1; i++){
            
            if(series[i]!=series[i+1]){
                uniqueSeries[arrIndex] = series[i];
                arrIndex++;
            }
            else{
                continue;
            }
        }
        uniqueSeries[uniqueSeries.length-1] = series[series.length-1];

        for(int number : uniqueSeries){
            System.out.print(number + " ");
        }
    }    
}
