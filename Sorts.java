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
}
