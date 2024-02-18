package Day61;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/subsets/

public class leetcodeQsn78 {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(ans, 0, nums, new ArrayList<>());
        return ans;
    }

    public void helper(List<List<Integer>> ans, int start, int[] nums, List<Integer> temp) {
        
        if (start >= nums.length) {
            ans.add(new ArrayList<>(temp));
        } else {
            // add the element and start the  recursive call
            temp.add(nums[start]);
            helper(ans, start + 1, nums, temp);
            // remove the element and do the backtracking call.
            temp.remove(temp.size() - 1);
            helper(ans, start + 1, nums, temp);
        }
    }
}
