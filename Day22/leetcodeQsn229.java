package Day22;

import java.util.ArrayList;
import java.util.List;

// https://leetcode.com/problems/majority-element-ii/

public class leetcodeQsn229 {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        int num1=0, num2=0;
        int count1=0, count2=0;

        // potential majority element
        for(int num:nums){
            if(num == num1) count1++;
            else if(num == num2) count2++;
            else if(count1 == 0){
                num1 = num;
                count1 = 1;
            }
            else if(count2 == 0){
                num2 = num;
                count2 = 1;
            } else{
                count1--;
                count2--;
            }
        }

        count1=count2=0; // to verify previous potential majority element
        for(int num:nums){
            if(num == num1) count1++;
            else if(num == num2) count2++;
        }

        if(count1 > n/3){
            ans.add(num1);
        }
        if(count2 > n/3){
            ans.add(num2);
        }
        return ans;
    }
}
