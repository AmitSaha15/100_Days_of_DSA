package Day10;

// https://leetcode.com/problems/jump-game/

public class leetcodeQsn55 {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int reach = 0;

        for (int i=0; i<n; i++){
            if (reach < i){
                return false;
            }
            reach = Math.max(reach, i + nums[i]);
        }

        return true;
    }
}
