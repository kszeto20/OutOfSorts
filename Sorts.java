import java.util.Arrays;
public class Sorts{
  public static void bubbleSort(int[] data) {

    for (int i = 0; i < data.length; i++) {
      for (int j = 1; j < data.length - 1; j++) {
        if (data[i] > data [j]) {
          int moving = data[j];
          data[j] = data[i];
          data[i] = moving;
          System.out.println(Arrays.toString(data));
        }
      }
    }
  }
}
