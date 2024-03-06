package Day78;

// https://www.geeksforgeeks.org/problems/minimum-number-of-steps-to-reach-a-given-number5234/1

public class MinStepsToDestination_GFG {
    static int minSteps(int D){
        // code here
        return steps(D, 0, 0);
    }
    
    static int steps(int D, int sum, int step){
        // keep adding the moves till our sum is not equal to or greater than the number 
        // if sum is equal to the number then that is our ans
        if(sum-D >= 0 && (sum-D) % 2 == 0){ //if sum is greater than the sum then we need to subtract that difference from our sum
            //  if the difference is even then we return step only
            return step;
        }
        step++;
        return steps(D, sum+step, step);
    }
}
