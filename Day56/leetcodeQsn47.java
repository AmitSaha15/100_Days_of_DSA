package Day56;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/permutations-ii/

public class leetcodeQsn47 {
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        permutations(result, new ArrayList<>(), nums, new boolean[nums.length]);
        return result;
    }

    public void permutations(List<List<Integer>> ans, List<Integer> temp, int[] arr, boolean[] visited) {
        // it is a permutaion if the lengths are same
        if(temp.size() == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // iterate over the arr for each elem pick the first elem then go back and 
        // try to pick the next elem
        for(int i=0; i<arr.length; i++){
            if(visited[i] || (i>0 && arr[i-1]==arr[i] && visited[i-1])) continue;

            visited[i] = true;
            temp.add(arr[i]); //add the new elem
            permutations(ans, temp, arr, visited); //try other elem
            visited[i] = false;
            temp.remove(temp.size()-1); //remove the elem
        }
    }
}
