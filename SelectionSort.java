import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SelectionSort {
  public static <T extends Comparable<T>> void sort(List<T> unsorted) {
    int mini;
    for (int i = 0; i < unsorted.size(); i++) {
      mini = i;
      for (int j = i; j < unsorted.size(); j++) {
        if (unsorted.get(j).compareTo(unsorted.get(mini)) < 0) {
          mini = j;
        }
      }
      T temp = unsorted.get(i);
      unsorted.set(i, unsorted.get(mini));
      unsorted.set(mini, temp);
    }
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
