class kth_largest_ele3 {

    static int kthLargest(int k,int arr[]){
        int n=arr.length;

        for(int i=0;i<k;i++){
            int maxIndex=0;
            for(int j=1;j<n-i;j++){
                if(arr[j]>arr[maxIndex]){
                    maxIndex=j;
                }
            }

            //keep that at the end of the array

            int temp=arr[maxIndex];
            arr[maxIndex]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
        return arr[n-k];
    }
    public static void main(String[] args){
        int arr[]={1,2,3,7,8,4};

        System.out.println(kthLargest(5,arr));
    }
}

