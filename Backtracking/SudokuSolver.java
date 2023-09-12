package Backtracking;

public class SudokuSolver {
    public static boolean solveSudoku(char[][] board) {
        return backtrack(board, 0, 0);
    }

    private static boolean backtrack(char[][] board, int row, int col) {
        int n = board.length;
        int m = board[0].length;

        // Base case: we have reached the last cell
        if (row == n) {
            return true;
        }

        // Move to the next row if we have reached the end of the current row
        if (col == m) {
            return backtrack(board, row + 1, 0);
        }

        // Skip already filled cells
        if (board[row][col] != '.') {
            return backtrack(board, row, col + 1);
        }

        // Try placing digits from 1 to 9
        for (char num = '1'; num <= '9'; num++) {
            if (isValid(board, row, col, num)) {
                board[row][col] = num;

                if (backtrack(board, row, col + 1)) {
                    return true;
                }

                // If the current configuration doesn't lead to a solution, backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    private static boolean isValid(char[][] board, int row, int col, char num) {
        // Check row
        for (int i = 0; i < board.length; i++) {
            if (board[row][i] == num) {
                return false;
            }
        }

        // Check column
        for (int i = 0; i < board.length; i++) {
            if (board[i][col] == num) {
                return false;
            }
        }

        // Check 3x3 box
        int startRow = 3 * (row / 3);
        int startCol = 3 * (col / 3);
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] == num) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
                { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
                { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
                { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
                { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
                { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
                { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
                { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
                { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        if (solveSudoku(board)) {
            System.out.println("Sudoku solution:");
            printBoard(board);
        } else {
            System.out.println("No solution exists.");
        }
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
