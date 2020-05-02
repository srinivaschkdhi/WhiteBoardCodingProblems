package src;

/*
Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

  1.  Integers in each row are sorted from left to right.
  2.  The first integer of each row is greater than the last integer of the previous row.

    search (first method) works even for matrix which does not satisfy 2 property
 */
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
        int high = rows * columns - 1;//*

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = matrix[mid / columns][mid % columns];//*

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
        int mat[][] = {
                {1, 3, 5, 7},
                {10, 11, 16, 20},
                {23, 30, 34, 50}
        };

        boolean b = new MatrixSortedSearch().searchMatrix(mat, 3);
        System.out.println("b = " + b);
    }

}
