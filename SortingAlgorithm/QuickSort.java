class QuickSort {
    static int partition(int arr[],int start,int end){
        int pivoteIndex=start-1;
        int pivote=arr[end];
        for(int i=start;i<end;i++){
            
            if(arr[i]<pivote){
              pivoteIndex++;
              int temp=arr[i];
              arr[i]=arr[pivoteIndex];
              arr[pivoteIndex]=temp;
            }
        }
        pivoteIndex++;
        int temp=arr[end];
        arr[end]=arr[pivoteIndex];
        arr[pivoteIndex]=temp;
        return pivoteIndex;
    }
    static void quickSort(int arr[],int start,int end){
        if(start>=end){
            return;
        }
        int pivoteIndex=partition(arr,start,end);
        quickSort(arr,start,pivoteIndex-1);
        quickSort(arr,pivoteIndex+1,end);

    }
    public static void main(String[] args) {
        int arr[]={5,10,2,78,80,55,1,9,3};
        int start=0;int end=arr.length-1;
        quickSort(arr,start,end);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
//timeComplexity O(NlogN)
//space O(N)
