
public class ReshapeMatrix {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length;
        int cols = nums[0].length;

        if ((rows * cols) != (r * c)) {
            return nums;
        }

        int[][] newShapeMatrix = new int[r][c];
        int rNum = 0;
        int cNum = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                newShapeMatrix[rNum][cNum] = nums[i][j];
                if (cNum == c) {
                    rNum++;
                    cNum = 0;
                }
            }
        }

        return newShapeMatrix;
    }
}
