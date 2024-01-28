package Day40;

import java.util.Arrays;

// https://leetcode.com/problems/largest-number/

public class leetcodeQsn179 {
    public String largestNumber(int[] nums) {
        int n = nums.length;
        String[] str = new String[n];

        for(int i=0; i<n; i++){
            str[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(str, (a,b) -> (b+a).compareTo(a+b));

        StringBuilder sb = new StringBuilder();
        for(String s : str){
            sb.append(s);
        }
        String ans = sb.toString();

        return ans.startsWith("0") ? "0" : ans;
    }
}
