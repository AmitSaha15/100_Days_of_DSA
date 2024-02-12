package Day55;

// https://leetcode.com/problems/next-permutation/

public class leetcodeQsn31 {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int index = -1;
        for(int i=n-2; i>=0; i--){ //find the break point
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        // if the break point does not exist reverse the array
        if(index == -1){
            reverse(nums, 0, n-1);
        } else{
            // find the smallest num that is >nums[index] and swap it with nums[index]
            for(int i=n-1; i>=index; i--){
                if(nums[i]>nums[index]){
                    swap(nums, i, index);
                    break;
                }
            }
            reverse(nums, index+1, n-1); // reverse the rest right half of the array
        }
    }
    public void swap(int[] arr, int s, int e){
        int temp = arr[s];
        arr[s] = arr[e];
        arr[e] = temp;
    }
    public void reverse(int[] arr, int i, int j){
        while(j>=i){
            swap(arr, i,j);
            i++;
            j--;
        }
    }
}
