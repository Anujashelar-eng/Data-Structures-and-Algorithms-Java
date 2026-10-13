class MergeSort {
  static void merge(int arr[],int start,int end,int mid){
    int n1=mid-start+1;
    int n2=end-mid;
    
    int leftArr[]=new int[n1];
    int rightArr[]=new int[n2];
    for(int i=0;i<n1;i++){
      leftArr[i]=arr[start+i];
    }
    for(int i=0;i<n2;i++){
      rightArr[i]=arr[mid+i+1];
    }
    int i = 0,j=0,k=start;
    while(i<n1 && j<n2){
      if(leftArr[i]<rightArr[j]){
        arr[k]=leftArr[i];
        i++;
      }else{
        arr[k]=rightArr[j];
        j++;
      }
      k++;
    }
    while(i<n1){
      arr[k]=leftArr[i];
      k++;
      i++;
    }
    while(j<n2){
      arr[k]=rightArr[j];
      j++;
      k++;
    }
  }
  static void mergeSort(int arr[],int start,int end){
    if(start>=end){
      return;
    }
    int mid=(start+end)/2;
    mergeSort(arr,start,mid);
    mergeSort(arr,mid+1,end);
    merge(arr,start,end,mid);
  }
  public static void main(String[] args){
    int arr[]={2,6,7,4,6,8,1};
    int start=0;
    int end=arr.length-1;
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
    System.out.println();
    mergeSort(arr,start,end);
    for(int i=0;i<arr.length;i++){
      System.out.print(arr[i]+" ");
    }
  }    
}
