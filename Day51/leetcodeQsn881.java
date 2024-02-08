package Day51;

import java.util.Arrays;

// https://leetcode.com/problems/boats-to-save-people/

public class leetcodeQsn881 {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int n = people.length;
        int count = 0;
        int left = 0;
        int right = n-1;

        while(right >= left){
            if(people[left] + people[right] <= limit){
                left++;
            }
            right--;
            count++;
        }
        return count;
    }
}
