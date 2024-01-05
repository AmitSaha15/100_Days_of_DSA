package Day17;

// https://leetcode.com/problems/find-the-duplicate-number/

public class leetcodeQsn287 {
    public int findDuplicate(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            if(nums[i] != i+1){
                int correctIndex = nums[i] - 1;
                if (nums[i] != nums[correctIndex]) {
                    swap(nums, i, correctIndex);
                } else{
                    return nums[i];
                }
            } else{
                i++;
            }
        }
        return 0;
    }
    void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
