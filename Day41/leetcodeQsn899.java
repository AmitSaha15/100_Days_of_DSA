package Day41;

import java.util.Arrays;

// https://leetcode.com/problems/orderly-queue/

public class leetcodeQsn899 {
    public String orderlyQueue(String s, int k) {
        if(k > 1){ //for k>1, the result string will always be sorted (insertion sort)
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            return new String(arr);
        }

        String ans = s;
        for(int i=1; i<s.length(); i++){
            String temp = s.substring(i)+s.substring(0,i);
            if(ans.compareTo(temp) > 0) ans=temp;  //if this combo is smaller than previous store the smaller combo
        }

        return ans;
    }
}
