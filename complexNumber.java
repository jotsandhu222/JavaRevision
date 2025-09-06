public class complexNumber {
    public static String complexToNormal(String firstNumber, String secondNumber){

        //firstNum to Int
        String real = firstNumber.replace(" ", "");
        String[] parts = real.split("\\+|(?=-)");

        int realNum1 = Integer.parseInt(parts[0]);
        int complexNum1 = Integer.parseInt(parts[1].replace("i", ""));
    
        //secondNumber to integers
        String real1 = secondNumber.replace(" ", "");
        String[] parts1 = real1.split("\\+|(?=-)");

        int realNum2 = Integer.parseInt(parts1[0]);
        int complexNum2 = Integer.parseInt(parts1[1].replace("i",""));

        int ans1 = realNum1 + realNum2;
        int ans2 = complexNum1 + complexNum2;

        return "your ans is " + Integer.toString(ans1) + " " + "+" + " " + Integer.toString(ans2) + "i";

    }
}
