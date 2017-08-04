import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class InsertionSort {
  public static <T extends Comparable<T>> void sort(List<T> unsorted) {
    int i = 1;
    while (i < unsorted.size()) {
      T x = unsorted.get(i);
      int j = i - 1;
      while (j >= 0 && unsorted.get(j).compareTo(x) > 0) {
        unsorted.set(j+1, unsorted.get(j));
        j = j - 1;
      }
      unsorted.set(j+1, x);
      i = i + 1;
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
