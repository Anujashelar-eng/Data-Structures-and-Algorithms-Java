package DSA75;
//Peak Elements It is greater than its neighbors.

class program5 {

    static void peak(int arr[]){
        int n = arr.length;

        if(n == 0) return;

        // Check first element
        if(n == 1 || arr[0] > arr[1]){
            System.out.println(arr[0]);
        }

        // Check middle elements
        for(int i = 1; i < n - 1; i++){
            if(arr[i] > arr[i - 1] && arr[i] > arr[i + 1]){
                System.out.println(arr[i]);
            }
        }

        // Check last element
        if(n > 1 && arr[n - 1] > arr[n - 2]){
            System.out.println(arr[n - 1]);
        }
    }

    public static void main(String[] args){
        int arr[] = new int[]{1,2,3};
        peak(arr);
    }
}