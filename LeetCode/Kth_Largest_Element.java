import java.util.Arrays;

class Kth_Largest_Element {
   static int find(int arr[],int k){
      Arrays.sort(arr);
    //   for(int i=0;i<arr.length;i++){
    //     System.out.print(arr[i]+" ");
    //   }
    //   System.out.println();
      return arr[arr.length-k];
   }
   public static void main(String[] args) {
      int arr[]={1,6,5,3,2,4};
      int k=4;
      System.out.println(find(arr,k));
   } 
}
