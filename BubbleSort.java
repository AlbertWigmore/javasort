import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BubbleSort {
  public static <T extends Comparable<T>> void sort(List<T> unsorted) {
    boolean swapped = false;
    do {
      swapped = false;
      for (int i = 1; i < unsorted.size(); i++) {
        if (unsorted.get(i-1).compareTo(unsorted.get(i)) > 0) {
          T temp = unsorted.get(i-1);
          unsorted.set(i-1, unsorted.get(i));
          unsorted.set(i, temp);
          swapped = true;
        }
      }
    }
    while (swapped);;
  }

  public static void main(String[] args) {
    Random rand = new Random();
    List<Integer> myList = new ArrayList<Integer>();

    for (int i = 0; i <= 50; i++) {
      myList.add(rand.nextInt());
    }
    sort(myList);
    System.out.println(myList);
  }
}
