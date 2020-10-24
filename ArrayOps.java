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

}
