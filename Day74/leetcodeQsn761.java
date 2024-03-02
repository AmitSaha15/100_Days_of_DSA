package Day74;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// https://leetcode.com/problems/special-binary-string/

public class leetcodeQsn761 {
    public String makeLargestSpecial(String s) {
        int count = 0;
        int l = 0; //start of the substring
        List<String> ans = new ArrayList<>();

        for(int r=0; r<s.length(); r++){ //r --> end of the substring
            if(s.charAt(r) == '1'){
                count++;
            } else{
                count--;
            }
            // when the count is 0 again means we just parsed a valid special substring
            if(count == 0){
                //take the inside of the substring and make sure it is largest speacial
                //first we take off the first and last char and only look at `s.substring(l+1, r)`
                //then we need to add the outside numbers back
                ans.add("1" + makeLargestSpecial(s.substring(l+1, r))+ "0");
                l = r+1; //move the start of the substring to the next char
            }
        }
        // sorting `ans` in lexicographically largest to smallest
        Collections.sort(ans, Collections.reverseOrder()); 

        return String.join("", ans);
    }
}
