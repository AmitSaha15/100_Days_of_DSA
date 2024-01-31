package Day43;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combination-sum-iii/

public class leetcodeQsn216 {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(1, n, k, ans, new ArrayList<>());
        return ans;
    }

    void findCombinations(int start, int target, int length, List<List<Integer>> ans, List<Integer> temp){
        if(target == 0){
            // if the size of the combination is equals to k add the combination to ans
            if(temp.size() == length){
                ans.add(new ArrayList<>(temp));
            }
            return;
        }

        for(int i=start; i<=9; i++){ //possible values of i are 1(start) to 9
            if(i<=target){
                temp.add(i);
                findCombinations(i+1, target-i, length, ans, temp);
                temp.remove(temp.size() - 1);
            } else{
                break;
            }
        }
    }
}
