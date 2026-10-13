package DSA2;

class program4 {
    static void maxEle(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println(max);
    }
   public static void main(String[] args){
    int arr[]={1,2,4,6,10,3,8};

     maxEle(arr);
   }    
}