public class PyramidUpAndDown {
    public static void main(String[] args){
        int count = 5;

        for(int i = 1; i<=count; i++){
            for(int j = i; j<count; j++){
                System.out.print(" ");
            }

            for(int k = i; k > 0; k--){
                System.out.print("*");
            }
            for(int l = 1; l < i; l++){
                    System.out.print("*");
                }

            System.out.println();
        }
    
        for(int i = count-1; i>=1; i--){
            for(int j = count; j>i; j--){
                System.out.print(" ");
            }

            for(int k = 0; k < i; k++){
                System.out.print("*");
            }
            for(int l = i; l > 1; l--){
                    System.out.print("*");
                }

            System.out.println();
        }
    }
}
