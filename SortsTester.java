import java.util.Arrays;
public class SortsTester {
  public static void main(String[]args){

    int[] test = new int[] {-1, -4, 12, -10, 90, 66, -11235};

    System.out.println("Original: " + Arrays.toString(test));
    System.out.println();
    Sorts.selectionSort(test);
    System.out.println(Arrays.toString(test));


    int[] test1 = new int[] {-23, 33, 2, 12, -534, 0};

    System.out.println("Original: " + Arrays.toString(test1));
    System.out.println();
    Sorts.insertionSort(test1);
    System.out.println(Arrays.toString(test1));

  }
}
