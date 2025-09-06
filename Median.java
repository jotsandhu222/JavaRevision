//script will get two unsorted arrays and then sort it and find the median

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Median {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        List<Integer> merged = new ArrayList<>();

        for(int number : nums1){
            merged.add(number);
        }
        for(int number : nums2){
            merged.add(number);
        }

        Collections.sort(merged);
        
        if(merged.size()%2==0){
            int ans = merged.size()/2;
            return (double)(merged.get(ans-1) + merged.get(ans))/2;
        }
        else{
            int ans = (merged.size() + 1)/2;
            return (double)merged.get(ans-1);
        }
    }

    public static void main(String[] args){
        int[] arr1 = {1,2,3};
        int[] arr2 = {4,5,6};
        System.out.print(findMedianSortedArrays(arr1, arr2));
    }
}
