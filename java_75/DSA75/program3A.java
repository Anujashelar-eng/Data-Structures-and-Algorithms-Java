package DSA75;

import java.util.Arrays;
class program3A{
static void findDuplicate(int arr[]) {
    Arrays.sort(arr);
    boolean found = false;

    for (int i = 0; i < arr.length - 1; i++) {
        if (arr[i] == arr[i + 1]) {
            System.out.println(arr[i]);
            found = true;

            // Skip all same elements
            while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                i++;
            }
        }
    }

    if (!found) System.out.println(-1);
}

public static void main(String[] args) {
    int arr[]=new int[]{1,2,3,3,3,4,5};
    findDuplicate(arr);
}
}