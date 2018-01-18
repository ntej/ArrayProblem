import java.util.Random;

/**
 * Map - pacific - islands
 * 1000x1000
 * 1x1 cell, landmass = 1
 * water = 0
 * [1] There are islands on 1 touching the border of the matrix
 * [2] There are islands that do not touch any border
 * Flip the 1's of islands[2] to 0
 * Keep the 1's of islands[1]
 * <p>
 * NOTE:TO PRINT THE MATRIX PROPERLY ON THE STANDARD SCREEN TERMIANLS, YOU CAN REDUCE THE @Constant rowSize @Constant coloumnSize
 */

public class Matrix {

    private static final int rowSize = 1000; //rowSize of the matrix
    private static final int columnSize = 1000; //columnSize of the matrix

    static int[][] matrix = new int[rowSize][columnSize];
    static boolean isOriginalMatrix;

    public static void main(String[] args) {
        initilizeMatrix(); //initializes matrix
        printMatrix(); //prints the initialized matrix
        solveToGivenCondition(); //solves the matrix
        printMatrix();//prints the solved matrix
    }

    /**
     * Method that initializes matrix to the given condition
     */
    private static void initilizeMatrix() {
        isOriginalMatrix = true;
        Random rand = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == 0 || j == 0 || i == matrix.length - 1 || j == matrix.length - 1) {
                    matrix[i][j] = 1;
                } else {
                    matrix[i][j] = rand.nextInt((1 + 1));
                }

            }
        }
    }

    /**
     * Method that solves the matrix to the given condition
     */
    private static void solveToGivenCondition() {
        isOriginalMatrix = false;
        for (int i = 1; i < matrix.length - 1; i++) {
            for (int j = 1; j < matrix[i].length - 1; j++) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    /**
     * Method to print the matrix
     */
    private static void printMatrix() {
        if (isOriginalMatrix) {
            System.out.println("---OriginalMatrix[" + rowSize + "][" + columnSize + "]---");
        } else {
            System.out.println("---SolvedMatrix[" + rowSize + "][" + columnSize + "]---");
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

}
