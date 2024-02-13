package Day56;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/pascals-triangle-ii/

public class leetcodeQsn119 {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        for (int row = 0; row <= rowIndex; row++) {
            ans.add(nCr(rowIndex , row ));
        }
        return ans;
    }
    public int nCr(int n, int r) {
        long res = 1;
        
        for (int i = 0; i < r; i++) {
            res = res * (n - i);
            res = res / (i + 1);
        }
        return (int) res;
    }
}
