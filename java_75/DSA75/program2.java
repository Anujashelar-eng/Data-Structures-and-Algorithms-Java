package DSA75;
//sort an array of 0s ,1s and 2s
class program2 {

    static void sort(int arr[]){
        int N=arr.length;


        for(int i=0;i<arr.length;i++){
         for(int j=0;j<arr.length;j++){
            if(arr[i]<arr[j]){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
         }   
        }

        for(int k=0;k<N;k++){
            System.out.print(arr[k]+" ");
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{0,2,1,2,0};
        sort(arr);
    }
}
