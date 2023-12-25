package Day6;

// https://leetcode.com/problems/rotate-array/

public class leetcodeQsn189 {
    public void rotate(int[] nums, int k) {
        int[] ans=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            ans[i]=nums[i];
        }

        if(k>nums.length){
            k= k % nums.length;

            for(int i=0;i<nums.length;i++){
              nums[i]=ans[((nums.length-k+i) % nums.length)];  
              
            }
        } else{
            for(int i=0;i<nums.length;i++){   
                nums[i]=ans[((nums.length-k+i)% ans.length)];
            }
        }       

    }
}
