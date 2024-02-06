package Day49;

// https://leetcode.com/problems/trapping-rain-water/

public class leetcodeQsn42 {
    public int trap(int[] height) {
        int n = height.length;
        if(n<=2) return 0;

        // calculate left max boundary
        int leftMax[] = new int[n];
        leftMax[0] = height[0];
        for(int i=1; i<n; i++){
            leftMax[i] = Math.max(height[i], leftMax[i-1]);
        }

        // calculate right max boundary
        int rightMax[] = new int[n];
        rightMax[n-1] = height[n-1];
        for(int i=n-2; i>=0; i--){
            rightMax[i] = Math.max(height[i], rightMax[i+1]);
        }

        // loop to calculate trapped water for each bar
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]); // water level = min(left max, right max)
            trappedWater += (waterLevel - height[i]); // trapped water = water level - height[i]
        }

        return trappedWater;
    }
}
