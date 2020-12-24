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

    for (int j = 0; j < data.length; j++) {

      int smallest = data[j];
      int smallestIndex = j;

      int testerVal = data[j];

      for (int i = j; i < data.length; i++) {
        if (data[i] < smallest) {
          smallest = data[i];
          smallestIndex = i;
        }
      }
      data[j] = smallest;
      data[smallestIndex] = testerVal;

    }
  }

  public static void insertionSort (int[] data) {
    int stored = 0;
    int storedIndex = 0;
    for (int i = 1; i < data.length; i++) {
      stored = data[i];
      storedIndex = i - 1;
      while (storedIndex >= 0 && stored < data[storedIndex]) {
        data[storedIndex + 1] = data[storedIndex];
        storedIndex--;
      }
      data[storedIndex + 1] = stored;
    }
  }




}
