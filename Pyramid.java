public class Pyramid {
    public static void makePyramid(){
        int pointIndex = 8/2;
        for(int i = 0; i<8; i++){
            pointIndex = pointIndex/2 - i;
            for(int j = 0; j<8; j++){
                    int endIndex = 0 + i;
                    if(j==pointIndex){
                        for(int k = j; k < endIndex; k++){
                            System.out.print("*");
                        }
                    }
                System.out.print(" ");    
            }
            pointIndex-=1;
            System.out.println();
        }
    }
    


        public static void main(String[] args) {
        makePyramid();;  // Example: first 10 Fibonacci numbers
    }
}
