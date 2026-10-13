class PrintSumSubArray {
  public static void main(String[] args) {
    int arr[]={2,4,1,3};
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            int sum=0;
           
            for(int k=i;k<=j;k++){
                sum=sum+arr[k];
            }
            System.out.println(sum);
        }
    }
   // System.out.println(count);
  }    
}
//Time Complexity O(N^3)
