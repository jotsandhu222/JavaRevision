// to find the index of numbers which on addition make the target number
// Example if array is {1,2,3,4,5} and target is 5 it will give ans [1, 2] on those indexes 2+3 = 5(target)


import java.util.Arrays;

public class FindAddIndex {
    
    public static int[] twoSum(int[] nums, int target) {
        int[] nums2 = new int[2];
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[i]+nums[j]==target){
                    nums2[0] = nums[i];
                    nums2[1] = nums[j];
                }
            }
        }
        return nums2;
    }    
 
    public static void main(String[] args){
        int[] som = {3,2,4};
        System.out.print(Arrays.toString(twoSum(som, 6)));
    }
}
