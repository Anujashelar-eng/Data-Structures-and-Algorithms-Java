//find the first occurance of needle in hayStack
class leetcode28 {
    public static void main(String args[]) {
        String haystack = "sadbutsad";
        String needle = "but";

        int index = -1;

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {
            int j;
            for (j = 0; j < needle.length(); j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }
            if (j == needle.length()) {
                index = i;
                break;
            }
        }

        System.out.println(index);
    }
}