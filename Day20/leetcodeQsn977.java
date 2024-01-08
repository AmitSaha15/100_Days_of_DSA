package Day20;

// https://leetcode.com/problems/squares-of-a-sorted-array/

public class leetcodeQsn977 {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        // for(int i=0; i<n; i++){
        //     ans[i] = nums[i]*nums[i];
        // }
        // Arrays.sort(ans);
        // return ans;

        int lp = 0;
        int rp = n-1;
        for(int i=n-1; i>=0; i--){
            if(Math.abs(nums[lp]) > Math.abs(nums[rp])){
                ans[i] = nums[lp] * nums[lp];
                lp++;
            } else{
                ans[i] = nums[rp]*nums[rp];
                rp--;
            }
        }
        return ans;
    }
}
