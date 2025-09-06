public class RotateArray {
    public static void main(String[] args){
        int[] series = {1, 2, 3, 4, 5, 6, 7};
        int d = 2;

        for(int i = d; i < series.length; i++){
            System.out.print(series[i] + ",");
        }
        for(int i = 0; i < d; i++){
            System.out.print(series[i] + ",");
        }
    }
}
