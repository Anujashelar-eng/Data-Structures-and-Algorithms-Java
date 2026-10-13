// Conveyor Belt Weight Grouping Problem

// A conveyor belt has N items placed sequentially, each with a certain weight.

// You are given:

// An integer N → number of items
// An integer W → maximum weight capacity per group
// An array weights[] of size N
//  Task:

// Group the items into sets such that:

// The sum of weights in each group is exactly equal to W
// Each item can be used only once
// Items must be taken in order from the conveyor belt (continuous grouping)
// Once a group reaches weight W, it is considered complete
// If adding an item exceeds W, start forming a new group from that item
// 👉 Output:

// Return the maximum number of groups that can be formed.

import java.util.*;

class ConveyorGroups {

    static int count = 0;

    public static void main(String[] args) {
        int[] weights = {1, 2, 3, 2, 3};
        int W = 5;

        boolean[] used = new boolean[weights.length];

        Arrays.sort(weights); // optional but helps optimization
        backtrack(weights, used, 0, 0, W);

        System.out.println("Number of groups: " + count);
    }

    static void backtrack(int[] arr, boolean[] used, int start, int currentSum, int target) {

        if (currentSum == target) {
            count++;
            return;
        }

        for (int i = start; i < arr.length; i++) {
            if (used[i] || currentSum + arr[i] > target)
                continue;

            used[i] = true;

            backtrack(arr, used, i + 1, currentSum + arr[i], target);

            used[i] = false;
        }
    }
}