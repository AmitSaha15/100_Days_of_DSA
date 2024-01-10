package Day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays/

public class leetcodeQsn349 {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> temp = new ArrayList<>();

        int ip = 0;
        int jp = 0;
        while(ip < nums1.length && jp < nums2.length){
            if(ip>0 &&nums1[ip]==nums1[ip-1]){
                ip++;
                continue;
            }
            if(nums1[ip] == nums2[jp]){
                temp.add(nums1[ip]);
                ip++;
                jp++;
            }
            else if(nums1[ip] > nums2[jp]){
                jp++;
            } else{
                ip++;
            }
        }
        int[] ans = new int[temp.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
