class PrintAllSubArray {
  public static void main(String[] args) {
    int arr[]={2,4,1,3};
    int count=0;
    for(int i=0;i<arr.length;i++){
        for(int j=i;j<arr.length;j++){
            count++;
            System.out.print("[");
            for(int k=i;k<=j;k++){
                System.out.print(arr[k]);
                //count++;
            }
            System.out.print("]");
        }
        System.out.println();
    }
    System.out.println(count);
  }    
}
