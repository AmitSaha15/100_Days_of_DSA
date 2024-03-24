package Day96;

// https://leetcode.com/problems/find-the-duplicate-number/

public class leetcodeQsn287 {
    public int findDuplicate(int[] nums) {
        // Hare and tortoise ----------->
        int slow = nums[0];
        int fast = nums[0];

        slow = nums[slow];
        fast = nums[nums[fast]];

        while (slow != fast){ //detect cycle
            slow = nums[slow];
            fast = nums[nums[fast]];
        }

        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow; //slow == fast


        // Bit manipulation ----------->
        // int n = nums.length;
        // int ans = 0;
        // for (int i=0 ; i<32 ; i++) {
        //     int mask = 1 << i;
        //     int count = 0;

        //     for (int num: nums) { //set bits in array
        //         count += (num & mask);
        //     }            

        //     for (int j=1 ; j<n ; j++) { //expected set bits in array
        //         count -= (j & mask);
        //     }
        //     if (count>0) ans |= mask; //if difference remains, must be from duplicate number
        // }
        // return ans;

        // Cyclic sort ---------->
        // int i = 0;
        // while (i < nums.length) {
        //     if(nums[i] != i+1){
        //         int correctIndex = nums[i] - 1;
        //         if (nums[i] != nums[correctIndex]) {
        //             swap(nums, i, correctIndex);
        //         } else{
        //             return nums[i];
        //         }
        //     } else{
        //         i++;
        //     }
        // }
        // return 0;
    }
    // void swap(int[] arr, int first, int second){
    //     int temp = arr[first];
    //     arr[first] = arr[second];
    //     arr[second] = temp;
    // }
}
