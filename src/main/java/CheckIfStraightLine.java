public class CheckIfStraightLine {
    public boolean checkStraightLine(int[][] coordinates) {
        int points = coordinates.length;
        int xdiff = Math.abs(coordinates[1][0] - coordinates[0][0]);
        int ydiff = Math.abs(coordinates[1][1] - coordinates[0][1]);

        int curr_xdiff, curr_ydiff;

        for (int i = 2; i < points; i++) {
            curr_xdiff = Math.abs(coordinates[i][0] - coordinates[i - 1][0]);
            curr_ydiff = Math.abs(coordinates[i][1] - coordinates[i - 1][1]);

            if ((ydiff * curr_xdiff) != (curr_ydiff * xdiff))
                return false;
        }

        return true;
    }
}

// slope of two points is y2-y1/x2-x1.
// Slope of points on straight line are equal
// formula modified to avoid divide by zero in case to find slope of duplicate/same points
