import java.util.Arrays;

class kth_LargestElement {
    static void kLargest(int arr[],int k){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        //O(n log n)
       System.out.println("Kth largest:"+arr[arr.length-k]);
    }
    public static void main(String[] args) {
        int k=3;
        int arr[]={30,40,10,20,50,6,3,2};
        kLargest(arr,k);
    }
}
