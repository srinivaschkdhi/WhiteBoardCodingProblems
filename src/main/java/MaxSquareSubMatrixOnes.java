public class MaxSquareSubMatrixOnes {
    public int maxSquareSubMatrixOnes(int[][] grid) {
        int maxArea = 0;
        int rows = grid.length;
        int columns = grid[0].length;

        int[][] newGrid = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0) {
                    newGrid[i][j] = grid[i][j];
                    maxArea = Math.max(maxArea, newGrid[i][j]);
                } else if (grid[i][j] == 0) {
                    newGrid[i][j] = 0;
                } else {
                    newGrid[i][j] = min(newGrid[i - 1][j - 1], newGrid[i - 1][j], newGrid[i][j - 1]) + 1;
                    maxArea = Math.max(maxArea, newGrid[i][j]);
                }
            }
        }
        return maxArea;
    }

    private int min(int a, int b, int c) {
        return (a <= b && a <= c) ? a : (b <= a && b <= c ? b : c);
    }
}
