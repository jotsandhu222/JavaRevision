// fibonacci:when the previous two numbers add up and makes the third number
// so the series will be 0,1,1,2,3,5,8....
// below function prints the numbers which are on even indexes like 0,1,3,8.......

public class Fibonacci {
    public static void evenAddition(int som){
        if(som==0||som==1) {
            System.out.print("sum is " + 0);
            return;
        }
        int[] series = new int[(som*2)+1];
        series[0] = 0;
        series[1] = 1;
        
        //create fbonacci series
        for(int i = 2; i < series.length; i++){
            series[i] = series[i-1] + series[i-2];
        }

        //add even fibonacci numbers
        int ans = 0;
        for(int k = 0; k < series.length; k+=2){
            ans = ans + series[k];
        }
        System.out.print("sum is " + ans + " ");
    }
}
