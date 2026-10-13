package DSA2;
//Second Largest Element in an array
class program6 {
  static void SecondLargest(int arr[]){
        if(arr.length < 2){
            System.out.println("Second largest not possible");
            return;
        }
     int firstL=Integer.MIN_VALUE;
     int second=firstL;

     for(int i=0;i<arr.length;i++){
        if(arr[i]>firstL){
            second=firstL;
            firstL=arr[i];
        }else if(arr[i]>second && arr[i]<firstL){
            second=arr[i];
        }
     }
     System.out.println("First Largest: "+firstL);
     System.out.println("second Largest: "+second);
  }
  public static void main(String[] args){
    int arr[]={2,3,7,14,5,6,8,18};
    SecondLargest(arr);
  }
}
