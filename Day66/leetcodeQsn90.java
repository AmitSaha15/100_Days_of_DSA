package Day66;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/subsets-ii/

public class leetcodeQsn90 {
    // runtime --> 1ms
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        subSet(ans, 0, nums, list);
        return ans;
    }

    public void subSet(List<List<Integer>> ans, int start, int[] nums, List<Integer> temp) {
        ans.add(new ArrayList<>(temp));

        for (int i=start; i<nums.length; i++) {
            //skip the duplicate elements
            if (i > start && nums[i] == nums[i - 1]) continue;
            temp.add(nums[i]);
            subSet(ans, i+1, nums, temp);
            temp.remove(temp.size() - 1);
        }
    }


    // runtime --> 9ms
    // public List<List<Integer>> subsetsWithDup(int[] nums) {
    //     List<List<Integer>> ans = new ArrayList<>();
    //     //sorting the `nums` array so that identical elements appear consecutively
    //     Arrays.sort(nums);
    //     helper(ans, 0, nums, new ArrayList<>());

    //     // create another List and store only unique subsets and return that list
    //     List<List<Integer>> unique = new ArrayList<>();
    //     for(List<Integer> temp : ans){
    //         if(!unique.contains(temp)){
    //             unique.add(temp);
    //         }
    //     }
    //     return unique;
    // }

    // public void helper(List<List<Integer>> ans, int start, int[] nums, List<Integer> temp) {
    //     if (start >= nums.length) {
    //         ans.add(new ArrayList<>(temp));
    //     } else {
    //         // add the element and start the  recursive call
    //         temp.add(nums[start]);
    //         helper(ans, start + 1, nums, temp);
    //         // remove the element and do the backtracking call.
    //         temp.remove(temp.size() - 1);
    //         helper(ans, start + 1, nums, temp);
    //     }
    // }
}
