package Day17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/3sum/

public class leetcodeQsn15 {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-2;i++){
            if(i==0 || (i>0 && nums[i] != nums[i-1])){
                int start = i+1;
                int end = n-1;
                int sum = 0-nums[i];
                while(end>start){
                    if(nums[start]+nums[end] == sum){
                        ans.add(Arrays.asList(nums[i],nums[start],nums[end]));
                        while(start < end && nums[start] == nums[start+1]) start++;
                        while(start<end && nums[end] == nums[end-1]) end--;
                        start++;
                        end--;
                    } else if(nums[start]+nums[end] > sum){
                        end--;
                    } else{
                        start++;
                    }
                }
            }
        }
        return ans;
    }
}
