package Day80;

import java.util.Arrays;

// https://leetcode.com/problems/count-elements-with-maximum-frequency/

public class leetcodeQsn3005 {
    public int maxFrequencyElements(int[] nums) {
        int[] freq = new int[100];
        for(int num : nums){ //find the frequency of all elements in the array
            freq[num-1]++;
        }

        Arrays.sort(freq);
        int maxFreq = freq.length-1;
        int totalMaxFreq = freq[maxFreq];

        while(maxFreq > 0 && freq[maxFreq] == freq[maxFreq-1]){
            totalMaxFreq += freq[maxFreq-1];
            maxFreq--;
        }
        return totalMaxFreq;
    }
}


// nums= [1,2,2,3,1,4]

// freq=[2,2,1,1]
// after sorting [1,1,2,2]
// maxFeq = 3 and totalMaxFreq = freq[3] = 2

// now iterate from right to left to find other max freq and keep adding them in totalMaxFreq
// check if freq[maxFreq] == freq[maxFreq-1] then add freq[maxFreq-1] to total freq
// then dec maxFreq

