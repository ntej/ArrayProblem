import java.util.Random;

public class Matrix {


private static final int rowSize = 100;
private static final int columnSize = 100;

  static int[][] matrix = new int[rowSize][columnSize];
  static boolean isOriginalMatrix;

  public static void main(String[] args) {
    initilizeMatrix();
    printMatrix();
    solveToGivenCondition();
    printMatrix();
  }

private static void initilizeMatrix(){
  isOriginalMatrix = true;
Random rand = new Random();
for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
if(i==0 || j == 0 || i==matrix.length-1 || j==matrix.length-1){
  matrix[i][j] = 1;
}else{matrix[i][j] = rand.nextInt((1 + 1));}

      }
  }
}

private static void solveToGivenCondition(){
isOriginalMatrix = false;
  for (int i = 1; i < matrix.length-1; i++) {
      for (int j = 1; j < matrix[i].length-1; j++) {
        if(matrix[i][j]==1){
        matrix[i][j]= 0;
      }
    }
  }
}

private static void printMatrix(){
  if(isOriginalMatrix){
    System.out.println("---OriginalMatrix["+rowSize+"]["+columnSize+"]---");
  }
  else
  {
    System.out.println("---SolvedMatrix["+rowSize+"]["+columnSize+"]---");
  }
  for (int i = 0; i < matrix.length; i++) {
      for (int j = 0; j < matrix[i].length; j++) {
          System.out.print(matrix[i][j] + " ");
      }
      System.out.println();
  }
}

}
