package Day3;

import java.util.ArrayList;

// https://leetcode.com/problems/create-target-array-in-the-given-order/description/

public class leetcodeQsn1389 {
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = nums.length;
        ArrayList<Integer> arr = new ArrayList<>();
        int[] target = new int[n];

        for(int i=0; i<n; i++){
            arr.add(index[i],nums[i]);
        }

        for(int i=0; i<n; i++){
            target[i] = arr.get(i);
        }

        return target;
    }
}
