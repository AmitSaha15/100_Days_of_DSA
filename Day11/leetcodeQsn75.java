package Day11;

// https://leetcode.com/problems/sort-colors/

public class leetcodeQsn75 {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int largest = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            largest = Math.max(largest,nums[i]);
        }

        int[] count = new int[largest+1];
        for(int i=0; i<n; i++){
            count[nums[i]]++;
        }

        int j=0;
        for(int i=0; i<count.length; i++){
            while(count[i] > 0){
                nums[j] = i;
                j++;
                count[i]--;
            }
        }
    }
}
