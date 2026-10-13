package DSA75;
// check if array sorted
class program7 {

    static void isSorted(int arr[]){
        boolean ascending = true;
        boolean descending = true;

        for(int i = 0; i < arr.length - 1; i++){
            
            if(arr[i] > arr[i+1]){
                ascending = false;
            }

            if(arr[i] < arr[i+1]){
                descending = false;
            }
        }

        if(ascending){
            System.out.println("Sorted in Ascending");
        }
        else if(descending){
            System.out.println("Sorted in Descending");
        }
        else{
            System.out.println("Not Sorted");
        }
    }

    public static void main(String args[]){
        int arr[] = new int[]{8,4,3,2,1};
        isSorted(arr);
    }
}