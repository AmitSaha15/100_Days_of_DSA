package Day94;

// https://leetcode.com/problems/beautiful-arrangement/

public class leetcodeQsn526 {
    int count = 0;
    public int countArrangement(int n) {
        int[] nums = new int[n+1];
        for(int i=1; i<=n; i++){
            nums[i]=i;
        }
        solve(nums, n);
        return count;
    }
    
    void solve(int[] nums, int val) {
        if(val == 0){
            count++;
            return;
        }
        
        for(int i=val; i>0; i--) {
            swap(nums, i, val);
            if(nums[val]%val == 0 || val%nums[val] == 0){
                solve(nums, val-1);
            }
            swap(nums, i, val);
        }
    }
    void swap(int[] nums, int i, int j) {
        int temp= nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
