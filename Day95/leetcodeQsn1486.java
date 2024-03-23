package Day95;

// https://leetcode.com/problems/xor-operation-in-an-array/

public class leetcodeQsn1486 {
    public int xorOperation(int n, int start) {
        int[] nums = new int[n];

        for(int i=0; i<n; i++){
            nums[i] = start + 2*i;
        }

        int ans = 0;
        for(int j=0; j<n; j++){
            ans ^= nums[j];
        }
        return ans;
    }
}
