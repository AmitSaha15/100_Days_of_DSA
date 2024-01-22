package Day34;

// https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/

public class leetcodeQsn1342 {
    public int numberOfSteps(int num) {
        return calculateSteps(num,0);
    }

    int calculateSteps(int num, int count){
        if(num == 0) return count;
        if(num%2 == 0){
            return calculateSteps(num/2,count+1);
        } else{
            return calculateSteps(num-1, count+1);
        }
    }
}
