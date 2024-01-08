package Day20;

// https://leetcode.com/problems/sort-array-by-parity-ii/

public class leetcodeQsn922 {
    public int[] sortArrayByParityII(int[] nums) {
        int n = nums.length;
        int ep = 0;
        int op = 1;
        while(ep<n && op<n){
            while(ep<n && nums[ep]%2 == 0){
                ep += 2;
            }
            while(op<n && nums[op]%2 == 1){
                op += 2;
            }
            if(ep<n && op<n){
                swap(nums, ep, op);
            }
        }
        return nums;
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
