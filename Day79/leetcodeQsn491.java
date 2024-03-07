package Day79;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/non-decreasing-subsequences/

public class leetcodeQsn491 {
    List<List<Integer>> ans;
    public List<List<Integer>> findSubsequences(int[] nums) {
        ans = new ArrayList<>();
        backtrack(0, nums, new ArrayList<>(), Integer.MIN_VALUE, ans);
        return ans;
    }

    public void backtrack(int idx, int[] nums, ArrayList<Integer> op, int prev, List<List<Integer>> ans){
        if(idx == nums.length){
            if(op.size() > 1){
              ans.add(new ArrayList<>(op));
            }
            return;
        }

        if(nums[idx] >= prev){
            op.add(nums[idx]);
            backtrack(idx+1, nums, op, nums[idx], ans);
            op.remove(op.size()-1);
        }
        if(nums[idx] == prev){
            return;
        }
        backtrack(idx+1, nums, op, prev, ans);
    }
}
