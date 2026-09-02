// LeetCode 1260: Shift 2D Grid
import java.util.*;

class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int total = m * n;
        k %= total;

        Integer[][] shifted = new Integer[m][n];

        for (int i = 0; i < total; i++) {
            int newIndex = (i + k) % total;
            shifted[newIndex / n][newIndex % n] = grid[i / n][i % n];
        }

        List<List<Integer>> result = new ArrayList<>();
        for (int r = 0; r < m; r++) {
            result.add(Arrays.asList(shifted[r]));
        }
        return result;
    }
}
