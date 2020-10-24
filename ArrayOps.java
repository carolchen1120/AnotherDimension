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

}
