import java.util.Arrays;
public class Sorts{

  public static void bubbleSort(int[] data) {

    int length = data.length;

    for (int i = 0; i < data.length; i++) {

      for (int j = 0; j < length - 1; j++) {

        int comp = data[j];
        int compNext = data[j + 1];

        if (comp > compNext) {
          data[j] = compNext;
          data[j + 1] = comp;
        }
      }
      length--;
    }
  }

  public static void selectionSort (int[] data) {

    int datalength = data.length;

    for (int j = 0; j < datalength; j++) {

      int smallest = data[j];
      int smallestIndex = j;

      int testerVal = data[j];

      for (int i = j + 1; i < data.length; i++) {
        if (data[i] < smallest) {
          smallest = data[i];
          smallestIndex = i;
        }
      }
      System.out.println(Arrays.toString(data));
      data[j] = smallest;
      data[smallestIndex] = testerVal;
      System.out.println(Arrays.toString(data));
      System.out.println();

      datalength--;
    }
  }

}
