package Day75;

import java.util.ArrayList;

// https://www.geeksforgeeks.org/problems/rat-in-a-maze-problem/1

public class Rat_in_a_mazeGFG {
    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here
        int[][] path = new int[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                path[i][j] = 0;
            }
        }
        
        ArrayList<String> ans = new ArrayList<>();
        if(m[0][0] == 1){
            allPath("", m, 0, 0, path, n, ans);
        }
        
        return ans;
    }
    
    static void allPath(String p, int[][] maze, int r, int c, int[][] path, int n, ArrayList<String> ans) {
        if (r == n - 1 && c == n - 1) {
            ans.add(p);
            return;
        }

        if (r+1 < n && path[r+1][c] == 0 && maze[r+1][c] == 1) {
            path[r][c] = 1;
            allPath(p + 'D', maze, r+1, c, path, n, ans);
            path[r][c] = 0;
        }

        if (c+1 < n && path[r][c+1] == 0 && maze[r][c+1] == 1) {
            path[r][c] = 1;
            allPath(p + 'R', maze, r, c+1, path, n, ans);
            path[r][c] = 0;
        }

        if (r-1 >= 0 && path[r-1][c] == 0 && maze[r-1][c] == 1) {
            path[r][c] = 1;
            allPath(p + 'U', maze, r-1, c, path, n, ans);
            path[r][c] = 0;
        }

        if (c-1 >= 0 && path[r][c-1] == 0 && maze[r][c-1] == 1) {
            path[r][c] = 1;
            allPath(p + 'L', maze, r, c-1, path, n, ans);
            path[r][c] = 0;
        }
        
    }
}
