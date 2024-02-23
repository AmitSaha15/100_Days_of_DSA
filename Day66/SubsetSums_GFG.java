package Day66;

import java.util.ArrayList;
import java.util.Collections;

// https://www.geeksforgeeks.org/problems/subset-sums2234/1

public class SubsetSums_GFG {
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> ans = new ArrayList<> ();
        subSetSum(ans, 0, 0, arr, N);
        Collections.sort(ans);
        return ans;
    }
    
    public void subSetSum(ArrayList<Integer> ans, int index, int sum, ArrayList<Integer> arr, int N) {
        if (index == N) {
            ans.add(sum);
            return;
        }

        // to pick the element
        subSetSum(ans, index+1, sum+arr.get(index), arr, N);
        
        // to ignore the element
        subSetSum(ans, index+1, sum, arr, N);
    }
}
