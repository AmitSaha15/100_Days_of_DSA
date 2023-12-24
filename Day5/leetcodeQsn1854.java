package Day5;

// https://leetcode.com/problems/maximum-population-year/

public class leetcodeQsn1854 {

    // Brute force --> time complexity = O(n^2)

    // public int maximumPopulation(int[][] logs) {
    //     int maxPopulationYear = 1950;
    //     int maxPopulation = 0;
    //     int[] arr = new int[101]; // (2050-1950) + 1 {ref: given constraints}

    //     for(int i=0; i<logs.length; i++){
    //         for(int j=logs[i][0]; j<logs[i][1]; j++){
    //             arr[j - 1950]++;  // calculating population from 1950 to 2050
    //         }
    //     }

    //     for(int i=0; i<arr.length; i++){
    //         if(maxPopulation < arr[i]){
    //             maxPopulation = arr[i];
    //             maxPopulationYear = i+1950;
    //         }
    //     }

    //     return maxPopulationYear;
    // }


    // Optimized --> time complexity = O(n)


    public int maximumPopulation(int[][] logs) {
        int maxPopulationYear = 1950;
        int maxPopulation = 0;
        int[] arr = new int[101]; // (2050-1950) + 1 {ref: given constraints}

        for(int i=0; i<logs.length; i++){
            // for(int j=logs[i][0]; j<logs[i][1]; j++){
            //     arr[j - 1950]++;  // calculating population from 1950 to 2050
            // }
            arr[logs[i][0] - 1950]++;
            arr[logs[i][1] - 1950]--;
        }

        // running sum
        for(int i=1; i<arr.length; i++){
            arr[i] += arr[i-1];
        }

        for(int i=0; i<arr.length; i++){
            if(maxPopulation < arr[i]){
                maxPopulation = arr[i];
                maxPopulationYear = i+1950;
            }
        }

        return maxPopulationYear;
    }


}
