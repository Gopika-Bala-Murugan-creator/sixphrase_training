import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams!");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams!");
        }
    }

    static boolean areAnagrams(String s1, String s2) {
        // If lengths differ, not an anagram
        if (s1.length() != s2.length()) return false;

        // Convert to char arrays and sort
        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
