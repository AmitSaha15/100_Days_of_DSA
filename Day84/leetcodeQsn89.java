package Day84;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/gray-code/

public class leetcodeQsn89 {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();

        if(n==1){
            List<Integer> list = new ArrayList<Integer>();
            list.add(0);
            list.add(1);
            return list;
        }
        
        List<Integer> prevRes = grayCode(n-1);
        for(int i=0;i<prevRes.size();i++){
            ans.add(0+2*prevRes.get(i));
        }
        for(int i=prevRes.size()-1 ; i>=0;i--){
            ans.add(1+2*prevRes.get(i));
        }
        
        return ans;
    }
}
