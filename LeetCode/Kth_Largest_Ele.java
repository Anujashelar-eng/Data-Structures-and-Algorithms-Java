import java.util.*;

class Solution {
    public int findKthLargestDistinct(int[] nums, int k) {

        // Step 1: Remove duplicates
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            set.add(num);
        }

        // Step 2: Convert to array
        Integer[] unique = set.toArray(new Integer[0]);

        // Step 3: Repeated max removal
        for (int i = 1; i < k; i++) {
            int maxIndex = 0;

            for (int j = 1; j < unique.length; j++) {
                if (unique[j] > unique[maxIndex]) {
                    maxIndex = j;
                }
            }

            unique[maxIndex] = Integer.MIN_VALUE;
        }

        // Step 4: Find kth largest
        int max = unique[0];
        for (int num : unique) {
            if (num > max) {
                max = num;
            }
        }

        return max;
    }
}

