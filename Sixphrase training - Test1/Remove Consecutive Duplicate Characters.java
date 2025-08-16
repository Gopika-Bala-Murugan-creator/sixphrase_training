public class RemoveConsecutive {
    public static void main(String[] args) {
        String str = "aabbccaa";
        StringBuilder result = new StringBuilder();
        
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                result.append(str.charAt(i));
            }
        }
        System.out.println("Output: " + result);
    }
}
