
public class WordSearch {

    boolean[][] visited;

    public boolean exist(char[][] board, String word) {
        int rows = board.length;
        int columns = board[0].length;

        visited = new boolean[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (word.charAt(0) == board[i][j] && searchWord(board, word, i, j, 0)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean searchWord(char[][] board, String word, int i, int j, int index) {
        if (index == word.length()) {
            return true;
        }

        if (i < 0 || i >= board.length || j < 0 || j >= board[i].length || word.charAt(index) != board[i][j] ||
                visited[i][j]) {
            return false;
        }

        visited[i][j] = true;

        if (searchWord(board, word, i + 1, j, index + 1) ||
                searchWord(board, word, i - 1, j, index + 1) ||
                searchWord(board, word, i, j - 1, index + 1) ||
                searchWord(board, word, i, j + 1, index + 1)) {
            return true;
        }

        visited[i][j] = false;
        return false;

    }
}
