package Day81;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/expression-add-operators/

public class leetcodeQsn282 {
    public List<String> addOperators(String num, int target) {
        List<String> ans = new ArrayList<>();
        solve(num, target, 0, "", ans, 0, 0);
        return ans;
    }

    public void solve(String num, int target, int idx, String curr, List<String> ans, long prev, long res){
        // prev --> curr number with operand(+/-/*)
        // res --> res which needs to be matched with target in the function call and its 
        // current value is current then the operation which we have done previously
        if(idx == num.length()){
            if(res == target){
                ans.add(curr);
            }
            return;
        }

        String str = "";
        long currRes = 0;
        for(int i=idx; i<num.length(); i++){
            if(i>idx && num.charAt(idx) == '0') break;

            str += num.charAt(i);
            currRes = currRes*10 + (num.charAt(i) - '0');

            if(idx == 0){
                solve(num, target, i+1, str, ans, currRes, currRes);
            } else{
                solve(num, target, i+1, curr+"+"+str, ans, currRes, res+currRes);
                solve(num, target, i+1, curr+"-"+str, ans, -currRes, res-currRes);
                // prev and res majorly changes in case of multiplication
                // i.e. res = res-prev+(prev*curr), prev = prev*curr
                solve(num, target, i+1, curr+"*"+str, ans, prev*currRes, res-prev+(prev*currRes));
            }
        }
    }
}
