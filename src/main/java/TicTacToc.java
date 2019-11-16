
public class TicTacToc {
    private int[] rowSum;
    private int[] columnSum;
    private int diagonalSum;
    private int antiDiagonalSum;

    public TicTacToc(int n) {
        rowSum = new int[n];
        columnSum = new int[n];
    }

    public int move(int row, int col, int player) {
        int playerValue = (player == 1) ? 1 : -1;

        if (row == col) {
            diagonalSum += playerValue;
        }

        if (col == (columnSum.length - 1 - row)) {
            antiDiagonalSum += playerValue;
        }

        rowSum[row] += playerValue;
        columnSum[col] += playerValue;

        int sizeOfBoard = rowSum.length;
        int winner = 0;

        if (Math.abs(diagonalSum) == sizeOfBoard ||
                Math.abs(antiDiagonalSum) == sizeOfBoard ||
                Math.abs(rowSum[row]) == sizeOfBoard ||
                Math.abs(columnSum[col]) == sizeOfBoard) {
            winner = player;
        }

        return winner;
    }
}
