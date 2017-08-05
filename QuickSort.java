import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class QuickSort {
  public static <T extends Comparable<T>> int partition(List<T> unsorted, int lo, int hi) {
    T pivot = unsorted.get(hi);
    int i = lo - 1;
    for (int j = lo; j <= hi - 1; j++) {
      if (unsorted.get(j).compareTo(pivot) < 0){
        i = i + 1;
        T temp = unsorted.get(i);
        unsorted.set(i, unsorted.get(j));
        unsorted.set(j, temp);
      }
    }
    if (unsorted.get(hi).compareTo(unsorted.get(i+1)) < 0) {
      T temp = unsorted.get(i + 1);
      unsorted.set(i + 1, unsorted.get(hi));
      unsorted.set(hi, temp);
    }
    return i + 1;
  }

  public static <T extends Comparable<T>> void sort(List<T> unsorted, int lo, int hi) {
    if (lo < hi) {
      int p = partition(unsorted, lo, hi);
      sort(unsorted, lo, p - 1);
      sort(unsorted, p + 1, hi);
    }
  }

  public static void main(String[] args) {
    Random rand = new Random();
    List<Integer> myList = new ArrayList<Integer>();

    for (int i = 0; i <= 50; i++) {
      myList.add(rand.nextInt());
    }
    sort(myList, 0, myList.size() - 1);
    System.out.println(myList);
  }
}
