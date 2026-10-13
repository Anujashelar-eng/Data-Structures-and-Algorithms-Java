class SumsubArray_ByPrefix {
    static void prefixSubArrSum(int arr[]){
        int prefixArr[]=new int[arr.length];
        prefixArr[0]=arr[0];
        for(int i=1;i<arr.length;i++){
           prefixArr[i]=prefixArr[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            for(int j=i;j<=i;j++){
            System.out.println(prefixArr[i]);
          }
       }
    }
    public static void main(String[] args) {
        int arr[]={2,4,1,3};
        prefixSubArrSum(arr);
    }
}
