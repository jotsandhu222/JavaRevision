public class pascalTriangle {
    public static void drawTriangle(int som){
        if(som%2==0){
            som += 1; 
        }
        System.out.println(som);
        int first = (som-1)/2;
        int[][] triangle = new int[som+1][som+1];
        int changeRow = 0;
        for(int row = 0; row < triangle.length; row++){
            for(int column = 0; column < triangle[row].length; column++){
                if(row==changeRow && column == first){
                    triangle[row][column] = 1;
                    changeRow++;
                    first -= 1;
                }
                else{
                    triangle[row][column] = 0;
                }
            }
        }
        for(int[] i : triangle){
            for(int j : i){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
