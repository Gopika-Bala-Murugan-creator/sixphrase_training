import java.util.*;
public class AnagramCheckCount {
    public static void main(String[] args) {
        String str1 = "triangle";
        String str2 = "integral";

        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are Anagrams!");
        } else {
            System.out.println(str1 + " and " + str2 + " are NOT Anagrams!");
        }
    }

    static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26]; // assuming lowercase letters

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;   // increase count for s1
            count[s2.charAt(i) - 'a']--;   // decrease count for s2
        }

        // If all counts are zero, then they are anagrams
        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }
}
