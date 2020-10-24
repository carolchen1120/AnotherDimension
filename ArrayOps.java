public class ArrayOps {

  public static int sum(int[] arr) {
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
        sum = sum + arr[i];
    }
    return sum;
  }


  public static int largest(int[] arr) {
    if (arr.length == 0) {
      return 0;
    }

    int answer = arr[0];

    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > answer) {
            answer = arr[i];
        }
    }

    return answer;
  }


  public static int[] sumRows(int[][] matrix) {
    int rows = matrix.length;
    int[] answer = new int[rows];
    for (int i = 0; i < rows; i++) {
      answer[i] = sum(matrix[i]);
    }
    return answer;
  }


  public static int[] largestInRows(int[][] matrix) {
    int rows = matrix.length;
    int[] answer = new int[rows];
    for (int i = 0; i < rows; i++) {
      answer[i] = largest(matrix[i]);
    }
    return answer;
  }


  public static int sum(int[][] matrix) {
    int[] firstStep = sumRows(matrix);
    return sum(firstStep);
  }


  public static int[] sumCols(int[][] matrix) {
    int cols = matrix[0].length;
    int rows = matrix.length;
    int[] answer = new int[cols];
    int value = 0;
    for (int i = 0; i < cols; i++) {
      for (int j = 0; j < rows; j++) {
        value = value + matrix[j][i];
      }
      answer[i] = value;
      value = 0;
    }
    return answer;
  }


  public static boolean isRowMagic(int[][] matrix) {
    int rows = matrix.length;
    int[] rowArray = sumRows(matrix);
    if (rowArray.length == 1) {
      return true;
    }
    for (int i = 0; i < rows-1; i++) {
      if (rowArray[i] != rowArray[i+1]) {
        return false;
      }
    }
    return true;
  }


  public static boolean isColMagic(int[][] matrix) {
    int cols = matrix[0].length;
    int[] colArray = sumCols(matrix);
    if (colArray.length == 1) {
      return true;
    }
    for (int i = 0; i < cols-1; i++) {
      if (colArray[i] != colArray[i+1]) {
        return false;
      }
    }
    return true;
  }


  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    int rows = matrix.length;
    int cols = matrix[0].length;
    int[] rowSums = sumRows(matrix);
    int[] colSums = sumCols(matrix);
    if (rowSums[row] == colSums[col]) {
      return true;
    } else {
      return false;
    }
  }

}
