package Day59;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/combinations/

public class leetcodeQsn77 {
    List<List<Integer>> ans;
    public List<List<Integer>> combine(int n, int k) {
        ans = new ArrayList<>();
        combinations(new ArrayList<>(), 1, n, k);
        return ans;
    }

    public void combinations(List<Integer> temp, int start, int n, int k){
        if(temp.size() == k){
            ans.add(new ArrayList<>(temp));
            return;
        }

        for(int i=start; i<=n; i++){
            temp.add(i);
            combinations(temp, i+1, n, k);
            temp.remove(temp.size()-1);
        }

        // if(k == 0){
        //     ans.add(new ArrayList<>(temp));
        //     return;
        // }

        // if(start > n) return;

        // temp.add(start);
        // combinations(temp, start+1, n, k-1);
        // temp.remove(temp.size()-1);
        // combinations(temp, start+1, n, k);
    }
}
