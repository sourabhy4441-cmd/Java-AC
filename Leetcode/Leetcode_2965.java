// find Missing And Repeated Values

import java.util.Arrays;
public class Leetcode_2965 {
    public static int[] findMissingAndRepeatedValues(int[][] grid) {
        // Step 1: Calculate total number of elements
        int n =grid.length;
        int totalElements = n*n;

        //  Create an array to count occurrences
        int[] counts = new int[totalElements+1];

// Count every number in the grid
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                counts[grid[i][j]]++;
            }
        }
        
        //  Step 4: Initialize the answers
        int repeated = -1;
        int missing = -1;
        
        // Step 5: Find the repeated and missing numbers
        for(int i=1;i<=totalElements;i++){
            if(counts[i] == 2){
                repeated = i;
            }else if(counts[i] == 0){
                missing = i;
            }
        }
        // Step 6: Return repeated first, then missing
        return new int[]{repeated,missing};
    }

    public static void main(String[] args){
        int[][] grid = {{9,1,7},{8,9,2},{3,4,6}};
        
        System.out.println(Arrays.toString(findMissingAndRepeatedValues(grid)));
    }
}
