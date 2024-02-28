package Day71;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/letter-case-permutation/

public class leetcodeQsn784 {
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();

        helper(s, "", ans, 0);
        return ans;
    }

    public void helper(String ip, String op, List<String> ans, int index){
        if(ip.length() == index){
            ans.add(op);
            return;
        }

        char ch = ip.charAt(index);
        if(Character.isLetter(ch)){
            if(Character.isUpperCase(ch)){
                helper(ip, op+ch, ans, index+1);
                helper(ip, op+Character.toLowerCase(ch), ans, index+1);
            } else{
                helper(ip, op+Character.toUpperCase(ch), ans, index+1);
                helper(ip, op+Character.toLowerCase(ch), ans, index+1);
            }
        } else{
            helper(ip, op+ch, ans, index+1);
        }
    }
}
