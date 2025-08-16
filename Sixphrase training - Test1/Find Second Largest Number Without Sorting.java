class Main {
    public static void main(String[] args) {
        int[] arr = {10, 4, 8, 15, 2};
        int first = 0, second = 0;

        for (int num : arr) {
            if (num > first) {
                second = first;
                first = num;
            } else if (num > second && num != first) {
                second = num;
            }
        }
        System.out.println("Second Largest: " + second);
    }
}