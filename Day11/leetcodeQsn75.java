package Day11;

// https://leetcode.com/problems/sort-colors/

public class leetcodeQsn75 {

    // better solution
    public void sortColors(int[] nums) {
        int n = nums.length;
        if(n == 0 || n == 1) return;

        int start = 0;
        int end = n-1;
        int index = 0;
        while(index <= end && end>start){
            if(nums[index] == 0){
                nums[index] = nums[start];
                nums[start] = 0;
                start++;
                index++;
            }
            else if(nums[index] == 2){
                nums[index] = nums[end];
                nums[end] = 2;
                end--;
            } else{
                index++;
            }
        }
    }




    // public void sortColors(int[] nums) {
    //     int n = nums.length;
    //     int largest = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         largest = Math.max(largest,nums[i]);
    //     }

    //     int[] count = new int[largest+1];
    //     for(int i=0; i<n; i++){
    //         count[nums[i]]++;
    //     }

    //     int j=0;
    //     for(int i=0; i<count.length; i++){
    //         while(count[i] > 0){
    //             nums[j] = i;
    //             j++;
    //             count[i]--;
    //         }
    //     }
    // }
}
