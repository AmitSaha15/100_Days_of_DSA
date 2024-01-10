package Day22;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// https://leetcode.com/problems/intersection-of-two-arrays-ii/

public class leetcodeQsn350 {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        List<Integer> temp = new ArrayList<>();

        int ip = 0;
        int jp = 0;
        while(ip < nums1.length && jp < nums2.length){
            if(nums1[ip] < nums2[jp]){
                ip++;
            }
            else if(nums1[ip] > nums2[jp]){
                jp++;
            } else{
                temp.add(nums1[ip]);
                ip++;
                jp++;
            }
        }
        int[] ans = new int[temp.size()];
        for(int i=0; i<ans.length; i++){
            ans[i] = temp.get(i);
        }
        return ans;
    }
}
