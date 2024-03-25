package Day97;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-duplicates-in-an-array/

public class leetcodeQsn442 {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> ans = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            int currNum = Math.abs(nums[i]);
            int currIdx = currNum-1;

            if(nums[currIdx] < 0){
                ans.add(currNum);
            } else{
                nums[currIdx] *= -1;
            }
        }
        return ans;


        // Sorting approach ------->
        // int i = 0;
        // while(i < nums.length){
        //     int correctIndex = nums[i] - 1;
        //     if(nums[i] != nums[correctIndex]){
        //         swap(nums, i, correctIndex);
        //     } else{
        //         i++;
        //     }
        // }
        // for(int index=0; index<nums.length; index++){
        //     if(nums[index] != index+1){
        //         ans.add(nums[index]);
        //     }
        // }
        // return ans;
    }
    // void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }
}
