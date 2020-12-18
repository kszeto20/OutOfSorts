import java.util.Arrays;
public class Sorts{
  public static void bubbleSort(int[] data) {
    for (int i = 0; i < data.length; i++) {
      int comp = data[i];
      for (int j = i; j < data.length - 1; j++) {
        System.out.println(Arrays.toString(data));
        if (comp > data [j + 1]) {
          int next = data[j + 1];
          data[j + 1] = data[i];
          data[i] = next;
          /*
          int moving = data[j + 1];
          data[j + 1] = data[i];
          System.out.println(Arrays.toString(data));
          data[i] = moving;
          System.out.println(Arrays.toString(data));
          */
        }
      }
    }
  }
}
