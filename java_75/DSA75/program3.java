package DSA75;
// Find Duplicate in Array, if not return -1
class program3 {

    static void findDuplicate(int arr[]) {

        boolean visited[] = new boolean[arr.length];
        boolean found = false;

        for (int i = 0; i < arr.length; i++) {

            if (visited[i]) {
                continue;    //skip the current iteration and all further code
            }

            boolean isDuplicate = false;

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    isDuplicate = true;
                }
            }

            if (isDuplicate) {      //VIMP
                System.out.println(arr[i]);
                found = true;
            }
        }




        if (!found) {
            System.out.println(-1);
        }
    }

    public static void main(String[] args) {
        int arr[] = new int[]{1, 2, 3, 3, 4, 5, 5, 5, 1};

        findDuplicate(arr);
    }
}