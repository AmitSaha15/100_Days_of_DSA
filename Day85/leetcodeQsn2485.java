package Day85;

// https://leetcode.com/problems/find-the-pivot-integer/

public class leetcodeQsn2485 {
    public int pivotInteger(int n) {
        if(n==1) return 1;
        int leftNum = 1;
        int rightNum = n;
        int leftSum = leftNum;
        int rightSum = rightNum;

        while(rightNum > leftNum){
            if(rightSum > leftSum){
                leftNum++;
                leftSum += leftNum;
            } else{
                rightNum--;
                rightSum += rightNum;
            }

            if(leftSum == rightSum && leftNum+1 == rightNum-1) return leftNum+1;
        }
        return -1;


        // Brute force approach ------->

        // for(int i=1; i<=n; i++){
        //     int leftSum = 0;
        //     int rightSum = 0;

        //     for(int j=1; j<=i; j++){
        //         leftSum += j;
        //     }
        //     for(int k=i; k<=n; k++){
        //         rightSum += k;
        //     }

        //     if(leftSum == rightSum) return i;
        // }
        // return -1;
    }
}
