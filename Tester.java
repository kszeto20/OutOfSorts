import java.util.Arrays;
public class Tester{

  public static void main(String[]args){
    //args 0 must be size of the Arrays
    //args 1 must be "bubble" or "test" (unless you add more)

    // making a random intArr
    int[] randData = new int[Integer.parseInt(args[0])];
    for(int i = 0 ; i < randData.length; i++){
      randData[i] =(int)(Math.random()*10000);
    }

    //copying intArr to manipulate
    int[] test = Arrays.copyOf(randData, randData.length);
    Arrays.sort(test);

    if(args[1].equals("bubble")){
      Sorts.bubbleSort(randData);
      if (Arrays.equals(randData, test)) {
        System.out.println("bubbleSort is good :)");
      }
      else {
        System.out.println( "bubbleSort is not working :(");
      }
    }
    if(args[1].equals("selection")){
      Sorts.selectionSort(randData);
      if (Arrays.equals(randData, test)) {
        System.out.println("selectionSort is good :)");
      }
      else {
        System.out.println( "selectionSort is not working :(");
      }
    }
    if(args[1].equals("insertion")){
      Sorts.insertionSort(randData);
      if (Arrays.equals(randData, test)) {
        System.out.println("insertionSort is good :)");
      }
      else {
        System.out.println( "insertionSort is not working :(");
      }
    }
  }
}
