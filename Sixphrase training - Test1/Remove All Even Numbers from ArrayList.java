import java.util.*;

public class RemoveEven {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6));

        list.removeIf(num -> num % 2 == 0);

        System.out.println("After removing evens: " + list);
    }
}
