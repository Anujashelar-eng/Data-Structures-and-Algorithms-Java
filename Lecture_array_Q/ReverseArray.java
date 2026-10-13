class ReverseArray {
    static void arrayRotaion(int arr[]){
        int N=arr.length;
        for(int i=0;i<N/2;i++){
           
           int temp=arr[i];
           arr[i]=arr[N-i-1];
           arr[N-i-1]=temp;

        }
    }
    public static void main(String[] args) {
        int arr[]={23,45,2,3,78,9};
        arrayRotaion(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

