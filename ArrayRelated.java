//1st- to add numbers of an array
//2nd- to find the largest number in an array

public class ArrayRelated {
    public static int add(){
        int[] numbers = {2, 4, 6, 7, 9};
        int sum = 0;

        for(int number : numbers){
            sum += number;
            //System.out.println(sum);
        }
        return sum;
    }

    public static int largest(){
        int[] numbers = {5, 2, 7, 9, 4};
        int ln = numbers[0];

        for(int number : numbers){
            if(number > ln){
                ln = number;
            }
            else{
                continue;
            }
        }
        return ln;
    }

    public static void main(String[] args){
        System.out.print("large num : " + largest());
    }
}
