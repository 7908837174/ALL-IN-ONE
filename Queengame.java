
class Main {

    public static void main(String[] args) {
        int n = 4;
        int[][] chess = new int[n][n];
        printNQueens(0, chess, "");
    }

    public static void printNQueens(int row, int[][] chess, String ans) {
        if (row == chess.length) {
            System.out.println(ans);
            return;
        }

        for (int col = 0; col < chess.length; col++) {
            if (isSafe(chess, row, col, chess.length)) {
                chess[row][col] = 1;
                printNQueens(row + 1, chess, ans + row + "-" + col + ",");
                chess[row][col] = 0;
            }
        }
    }

    public static boolean isSafe(int[][] chess, int row, int col, int n) {
        for (int i = 0; i < row; i++) {
            if (chess[i][col] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (chess[i][j] == 1) {
                return false;
            }
        }
        return true;
    }
}
