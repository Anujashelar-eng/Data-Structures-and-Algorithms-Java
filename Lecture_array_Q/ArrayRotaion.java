class ArrayRotation {

    static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    static void leftRotate(int[] arr, int k) {
        int n = arr.length;
        k = k % n; // handles k > n

        reverse(arr, 0, k - 1);     // Step 1
        reverse(arr, k, n - 1);     // Step 2
        reverse(arr, 0, n - 1);     // Step 3
    }

    public static void main(String[] args) {
        int[] arr = {23, 45, 2, 3, 78, 9};
        leftRotate(arr, 2);

        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
