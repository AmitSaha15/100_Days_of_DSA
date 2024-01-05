package Day17;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/

public class leetcodeQsn448 {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i] - 1;
            if (nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }

        List<Integer> ans = new ArrayList<>();
        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                ans.add(index+1);
            }
        }

        return ans;
    }

    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
