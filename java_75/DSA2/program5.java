package DSA2;
//Find the minimum Element in an array
class program5 {
  static void minimumEle(int arr[]){
     int min=Integer.MAX_VALUE;

     for(int i=0;i<arr.length;i++){
        if(arr[i]<min){
            min=arr[i];
        }
     }
     System.out.println(min);
  }
  public static void main(String[] args){
    int arr[]={2,3,7,14,5,6,1,8,18};
    minimumEle(arr);
  }
}
