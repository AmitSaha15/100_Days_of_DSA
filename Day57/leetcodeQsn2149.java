package Day57;

// leetcode.com/problems/rearrange-array-elements-by-sign/

public class leetcodeQsn2149 {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int posIdx = 0;
        int negIdx = 1;
        
        for(int num : nums){
            if(num >= 0){
                ans[posIdx] = num;
                posIdx += 2;
            } else{
                ans[negIdx] = num;
                negIdx += 2;
            }
        }
        return ans;


        // List<Integer> pos = new ArrayList<>();
        // List<Integer> neg = new ArrayList<>();

        // for(int num : nums){
        //     if(num < 0){
        //         neg.add(num);
        //     }else{
        //         pos.add(num);
        //     }
        // }

        // for(int i=0; i<nums.length; i++){
        //     if(i%2 == 0){
        //         nums[i] = pos.get(i/2);
        //     } else{
        //         nums[i] = neg.get(i/2);
        //     }
        // }
        // return nums;

    }
}
