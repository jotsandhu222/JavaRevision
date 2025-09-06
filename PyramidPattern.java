public class PyramidPattern {
    public static void main(String[] args) {
        int n = 5; // number of rows

        for (int i = 1; i <= n; i++) {
            // print spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // print numbers from 1 to i
            for (int k = 1; k <= i; k++) {
                System.out.print(k + " ");
            }

            System.out.println(); // move to next line
        }
    }
}
