package Day52;

// https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/

public class leetcodeQsn80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;

        for(int num : nums){
            if(i==0 || i==1 || nums[i-2] != num){ //i==0 and i==1 ensures 1st & 2nd elem
                // is always in the modified array and the last condition checks for the
                // only two occurrences of any elem are included in modified array
                nums[i] = num;
                i++;
            }
        }
        return i;

        // int n = nums.length;
        // int count = 1; //for counting the duplicates
        // int i = 0;

        // for(int j=i+1; j<n; j++){
        //     if(count < 2 && nums[i] == nums[j]){
        //         i++;
        //         count++;
        //         nums[i] = nums[j];
        //     } else if(nums[i] != nums[j]){
        //         i++;
        //         count = 1;
        //         nums[i] = nums[j];
        //     }
        // }
        // return i+1;
    }
}
