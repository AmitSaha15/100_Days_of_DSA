package Day3;

// https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/description/

public class leetcodeQsn1365 {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];

        for(int i=0; i<nums.length; i++){
            int count = 0;
            for(int j=0; j<nums.length; j++){
                
                if(nums[j]<nums[i]){
                    count++;
                }
            }

            ans[i] = count;
        }

        return ans;
    }
}
