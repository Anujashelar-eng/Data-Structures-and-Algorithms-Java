package DSA2;

class Program7 {

    static void isSorted(int arr[]) {

        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < arr.length - 1; i++){
            if(arr[i] > arr[i + 1]) {
                ascending = false;
            }
            if(arr[i] < arr[i + 1]) {
                descending = false;
            }
        }

        if(ascending)
            System.out.println("Sorted in Ascending Order");
        else if(descending)
            System.out.println("Sorted in Descending Order");
        else
            System.out.println("Array is Not Sorted");
    }

    public static void main(String[] args){
        int arr[] = {2,3,4,5,7,8};
        isSorted(arr);
    }
}