// 🔹 Why 'a' - 'a' = 0 ?

// In Java, characters are stored as numbers internally using a system called ASCII / Unicode.

// 👉 Each character has a numeric value:

// 'a' = 97
// 'b' = 98
// 'b' - 'a' = 98 - 97 = 1
// 'c' - 'a' = 99 - 97 = 2
// 'n' - 'a' = 110 - 97 = 13
// 'z' - 'a' = 122 - 97 = 25

public class AnagramPrefer {
    static boolean isAnagram(String s, String t) {

    if (s.length() != t.length()) return false;

    int[] freq = new int[26];

    for (int i = 0; i < s.length(); i++) {
        freq[s.charAt(i) - 'a']++;
        freq[t.charAt(i) - 'a']--;
    }

    for (int count : freq) {
        if (count != 0) return false;
    }

    return true;
}
}
