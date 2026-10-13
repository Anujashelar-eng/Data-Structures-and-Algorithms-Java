//Need Sorted Array
class binary_search {
    static int binarySearch(int arr[],int key){
        int start=0,end=arr.length-1;
        while(start<=end){
            int mid=(start+end)/2;
            if(arr[mid]==key){
                System.out.print("Found at index: ");
                return mid;
            }else if(arr[mid]>key){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int arr[]={10,20,45,89,90};
        int key=5;
        System.out.println(binarySearch(arr,key)); 
    }
}
