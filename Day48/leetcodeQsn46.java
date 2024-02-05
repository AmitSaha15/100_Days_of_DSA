package Day48;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/permutations/

public class leetcodeQsn46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        permutations(result, new ArrayList<>(), nums);
        return result;
    }
    
    public void permutations(List<List<Integer>> ans, List<Integer> temp, int[] arr) {
        // it is a permutaion if the lengths are same
        if(temp.size() == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }
        // iterate over the arr for each elem pick the first elem then go back and 
        // try to pick the next elem
        for(int num : arr){
            if(temp.contains(num)) continue; // skip the duplicate num

            temp.add(num); //add the new elem
            permutations(ans, temp, arr); //try other elem
            temp.remove(temp.size()-1); //remove the elem
        }
    }
}
