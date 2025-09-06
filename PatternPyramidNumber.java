public class PatternPyramidNumber {
    public static void main(String[] args){
        int len = 7;

        for(int i = 1; i<=len; i++){
            for(int j = i; j<len; j++){
                System.out.print(" ");
            }

            for(int k = i; k > 0; k--){
                System.out.print(k);
            }
            for(int l = 1; l < i; l++){
                    System.out.print(l+1);
                }

            System.out.println();
        }
    }
}
