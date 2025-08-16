public class CommonNumbers {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {3, 4, 5, 6};

        System.out.print("Common elements: ");
        for (int i : arr1) {
            for (int j : arr2) {
                if (i == j) System.out.print(i + " ");
            }
        }
    }
}
