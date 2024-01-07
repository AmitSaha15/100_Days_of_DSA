package Day19;

// https://leetcode.com/problems/sort-array-by-parity/

public class leetcodeQsn905 {
    public int[] sortArrayByParity(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n-1;
        while(right > left){
            if(nums[left]%2==1 && nums[right]%2==0){
                swap(nums,left,right);
                left++;
                right--;
            }
            else if(nums[left]%2==0 && nums[right]%2==1){
                left++;
                right--;
            }
            else if(nums[left]%2==1 && nums[right]%2==1){
                right--;
            } else{
                left++;
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
