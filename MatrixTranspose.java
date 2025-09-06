public class MatrixTranspose {

    public static void main(String[] args){
        int[][] series = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] series2 = new int[series.length][series[0].length];
        
        for(int i = 0; i < series.length; i++){
            for(int j = 0; j < series.length; j++){
                series2[i][j] = series[j][i];
            }
        }
        
        for(int[] numbers : series){
            System.out.print("[ ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.print("]");
        System.out.println();
    } 
        for(int[] numbers : series2){
            System.out.print("[ ");
        for(int number : numbers){
            System.out.print(number + " ");
        }
        System.out.print("]");
        System.out.println();
    }       
    }

}

