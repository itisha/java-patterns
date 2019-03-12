package puzzles.keep.city.skyline;

import java.util.Arrays;

public class Solution {
    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] leftToRight = new int[grid.length];
        int[] topToBottom = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            leftToRight[i] = Arrays.stream(grid[i]).max().getAsInt();

            int maxCol = 0;
            for (int j = 0; j < grid.length; j++) {
                if (grid[j][i] > maxCol) {
                    maxCol = grid[j][i];
                }
            }

            topToBottom[i] = maxCol;
        }

        int summ = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                summ += Math.min(topToBottom[j], leftToRight[i]) - grid[i][j];
            }
        }

        return summ;
    }
}
