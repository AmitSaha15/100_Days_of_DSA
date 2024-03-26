package Day98;

// https://leetcode.com/problems/first-missing-positive/

public class leetcodeQsn41 {
    public int firstMissingPositive(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correctIndex = nums[i]-1;
            if (nums[i]>0 && nums[i] <= nums.length && nums[i] != nums[correctIndex]) {
                swap(nums, i, correctIndex);
            } else{
                i++;
            }
        }

        for(int index=0; index<nums.length; index++){
            if(nums[index] != index+1){
                return index+1;
            }
        }
        return nums.length+1;


        // int n = nums.length;
        // boolean contains1 = false;

        // for (int i = 0; i < n; i++) {
        //     // Check whether 1 is in the original array
        //     if (nums[i] == 1) {
        //         contains1 = true;
        //     }
        //     if (nums[i] <= 0 || nums[i] > n) {
        //         nums[i] = 1;
        //     }
        // }

        // if (!contains1) return 1;

        // // Mark whether integers 1 to n are in nums
        // // Use index as a hash key and negative sign as a presence detector.
        // for (int i = 0; i < n; i++) {
        //     int val = Math.abs(nums[i]);
        //     int idx = val - 1;

        //     if (nums[idx] < 0) continue;
        //     nums[idx] *= -1;
        // }

        // // First positive in nums is smallest missing positive integer
        // for (int i = 0; i < n; i++) {
        //     if (nums[i] > 0)
        //         return i + 1;
        // }

        // return n + 1;
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
