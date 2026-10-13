package DSA75;

class program3B {
    static void findDuplicate(int arr[]) {
    boolean found = false;

    for (int i = 0; i < arr.length; i++) {

        boolean alreadyPrinted = false;

        // Check if element appeared before
        for (int k = 0; k < i; k++) {
            if (arr[i] == arr[k]) {
                alreadyPrinted = true;
                break;
            }
        }

        if (alreadyPrinted) continue;

        // Check for duplicates ahead
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[i] == arr[j]) {
                System.out.println(arr[i]);
                found = true;
                break;
            }
        }
    }

    if (!found) System.out.println(-1);
}
    public static void main(String[] args) {
        int arr[]=new int[]{1,2,3,3,3,4,5,5,6};
    }
}
