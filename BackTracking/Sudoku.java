package BackTracking;

public class Sudoku {

    public static boolean isSafe(int suduku[][], int row, int col, int digit) {
        // Column check
        for (int i = 0; i < 9; i++) {
            if (suduku[i][col] == digit) {
                return false;
            }
        }

        // Row check
        for (int j = 0; j < 9; j++) {
            if (suduku[row][j] == digit) {
                return false;
            }
        }

        // Grid check
        int sr = (row / 3) * 3;
        int sc = (col / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (suduku[i][j] == digit) {
                    return false;
                }
            }
        }

        
        return true;
    }

    public static boolean sudokuSolver(int suduku[][], int row, int col) {
        // Base case
        if (row == 9) {
            return true; // Sudoku is solved
        }

        // Move to next row if end of column is reached
        int nextRow = row, nextCol = col;
        if (col + 1 == 9) { 
            nextRow = row + 1;
            nextCol = 0;
        } else {
            nextCol = col + 1;
        }

        // If cell is already filled, move to next cell
        if (suduku[row][col] != 0) {
            return sudokuSolver(suduku, nextRow, nextCol);
        }

        // Try placing numbers from 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(suduku, row, col, digit)) {
                suduku[row][col] = digit;

                
                if (sudokuSolver(suduku, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                suduku[row][col] = 0;
               
            }
        }

        return false;
    }

    public static void printSudoku(int suduku[][]) {
        for (int i = 0; i < 9; i++) {
            if (i % 3 == 0 && i != 0) { 
                System.out.println("------------------------");
            }
            for (int j = 0; j < 9; j++) {
                if (j % 3 == 0 && j != 0) { // Print a separator after every 3 columns
                    System.out.print("| ");
                }
                System.out.print(suduku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int suduku[][] = {
            {0, 0, 8, 0, 0, 0, 0, 0, 0},
            {4, 9, 0, 1, 5, 7, 0, 0, 2},
            {0, 0, 3, 0, 0, 4, 1, 9, 0},
            {1, 8, 5, 0, 6, 0, 0, 2, 0},
            {0, 0, 0, 0, 2, 0, 0, 6, 0},
            {9, 6, 0, 4, 0, 5, 3, 0, 0},
            {0, 3, 0, 0, 7, 2, 0, 0, 4},
            {0, 4, 9, 0, 3, 0, 0, 5, 7},
            {8, 2, 7, 0, 0, 9, 0, 1, 3},
        };

        if (sudokuSolver(suduku, 0, 0)) {
            System.out.println("\nSolution exists:\n");
            printSudoku(suduku);
        } else {
            System.out.println("Solution does not exist.");
        }
    }
}
