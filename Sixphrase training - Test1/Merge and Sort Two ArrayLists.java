import java.util.*;

public class MergeSortArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(3, 1, 4));
        ArrayList<Integer> arr2 = new ArrayList<>(Arrays.asList(4, 5, 6));

        arr1.addAll(arr2); // merge
        Collections.sort(arr1); // sort

        ArrayList<Integer> uniqueList = new ArrayList<>();
        for (int num : arr1) {
            if (uniqueList.isEmpty() || uniqueList.get(uniqueList.size() - 1) != num) {
                uniqueList.add(num);
            }
        }

        System.out.println("Sorted merged list without duplicates: " + uniqueList);
    }
}
