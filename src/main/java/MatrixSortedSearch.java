class MatrixSortedSearch {
    private static void search(int[][] mat, int n, int x) {

        int i = 0, j = n - 1; // set indexes for top right// element

        while (i < n && j >= 0) {
            if (mat[i][j] == x) {
                System.out.print("n Found at " + i + " " + j);
                return;
            }
            if (x < mat[i][j]) {
                j--;
            } else // if x > mat[i][j]
            {
                i++;
            }
        }

        System.out.print("n Element not found");
        return; // if ( i==n || j== -1 )
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix.length == 0) {
            return false;
        }

        int rows = matrix.length;
        int columns = matrix[0].length;

        int low = 0;
        int high = rows * columns - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = matrix[mid / columns][mid % columns];

            if (target == midElement) {
                return true;
            } else if (target < midElement) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        return false;
    }

    // driver program to test above function
    public static void main(String[] args) {
        int mat[][] = {{10, 20, 30, 40},
                {15, 25, 35, 45},
                {27, 29, 37, 48},
                {32, 33, 39, 50}};

        search(mat, 4, 29);
    }

}
