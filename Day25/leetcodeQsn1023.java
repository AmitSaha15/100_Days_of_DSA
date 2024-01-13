package Day25;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/camelcase-matching/

public class leetcodeQsn1023 {
    public List<Boolean> camelMatch(String[] queries, String pattern) {
        List<Boolean> ans = new ArrayList<>();
        for(int i=0; i<queries.length; i++){
            ans.add(checkCamelCase(queries[i],pattern));
        }
        return ans;
    }

    boolean checkCamelCase(String str, String pattern){
        int index=0;
        int cap=0;
        for(int i=0; i<str.length(); i++){
            if(index<pattern.length() && str.charAt(i) == pattern.charAt(index)) index++;
            else if(str.charAt(i)>='A' && str.charAt(i)<='Z') cap++;
        }
        return (index==pattern.length() && cap==0);
    }
}
