package Day68;

// https://leetcode.com/problems/restore-ip-addresses/

import java.util.ArrayList;
import java.util.List;

public class leetcodeQsn93 {
    int n;
    List<String> ans;
    public List<String> restoreIpAddresses(String s) {
        n = s.length();
        ans = new ArrayList<>();
        ans.clear();

        if(n > 12) return ans;
        solve(s, 0, 0, "");
        return ans;
    }

    public void solve(String str, int index, int parts, String currStr){
        if(parts > 4) return;
        if(parts == 4 && index == n){
            currStr = currStr.substring(0, currStr.length()-1); //removing the extra dot at last
            ans.add(currStr); 
            return;
        }

        if(index+1 <= n){ //case1: taking 1 char at a time
            solve(str, index+1, parts+1, currStr+str.substring(index,index+1)+".");
        }

        if(index+2 <= n && isValid(str.substring(index,index+2))){ //case2: taking 2 chars at a time
            solve(str, index+2, parts+1, currStr+str.substring(index,index+2)+".");
        }

        if(index+3 <= n && isValid(str.substring(index,index+3))){ //case3: taking 3 chars at a time
            solve(str, index+3, parts+1, currStr+str.substring(index,index+3)+".");
        }
    }

    public boolean isValid(String str){
        if(str.charAt(0) == '0') return false;

        if(Integer.parseInt(str) > 255) return false;
        return true;
    }
}
