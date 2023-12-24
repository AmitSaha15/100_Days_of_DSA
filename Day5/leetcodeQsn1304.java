package Day5;

// https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/

public class leetcodeQsn1304 {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        int num = -(n/2);

        if(n%2 != 0){
            for(int i=0; i<n; i++){
                ans[i] = num;
                num += 1;
            }
        } else{
            for(int i=0; i<n; i++){
                if(num == 0){
                    num += 1;
                }
                ans[i] = num;
                num += 1;

            }
        }
        return ans;
    }
}
