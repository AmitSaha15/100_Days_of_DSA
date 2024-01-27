package Day39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/combination-sum-ii/

public class leetcodeQsn40 {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
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
            findCombinations(arr, target-arr[index], index+1, ans, temp);
            temp.remove(temp.size() - 1);
        }

        // dealing with the duplicates
        index = index+1;
        while(index < arr.length && arr[index] == arr[index-1]){
            index++;
        }

        findCombinations(arr, target, index, ans, temp);
    }
}
