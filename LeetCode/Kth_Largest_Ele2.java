class Kth_Largest_Ele2 {
    
   static void find(int arr[],int k){

    for(int x=0;x<k-1;x++){
      int maxIndex=0;
      for(int i=1;i<arr.length;i++){
        if(arr[i]>arr[maxIndex]){
            maxIndex=i;
        }
      }
      arr[maxIndex]=Integer.MIN_VALUE;
    }

    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println();

    int kMax=Integer.MIN_VALUE;
    for(int i=0;i<arr.length;i++){
        if(kMax<arr[i]){
            kMax=arr[i];
        }
    }
    System.out.println(kMax);
      
   }
   public static void main(String[] args) {
      int arr[]={1,6,5,3,2,4};
      int k=1;
      find(arr, k);
   } 
}

