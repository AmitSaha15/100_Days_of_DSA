package Day33;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum/

public class leetcodeQsn39 {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(candidates, target, 0, ans, new ArrayList<>());
        return ans;
    }

    void findCombinations(int[] arr, int target, int index, List<List<Integer>> ans, List<Integer> temp){
        int n = arr.length;
        if(index == n){
            if(target == 0){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        if(arr[index] <= target){
            temp.add(arr[index]);
            findCombinations(arr, target-arr[index], index, ans, temp);
            temp.remove(temp.size() - 1);
        }

        findCombinations(arr, target, index+1, ans, temp);
    }
}
