package DSA2;
//write a program to reverse an array
class program10 {
    static void reverse(int arr[]){
        int arr2[]=new int[arr.length];
        int n=arr.length;
        for(int i=0;i<arr.length;i++){
            arr2[i]=arr[n-1-i];
        }

        for(int i=0;i<arr.length;i++){
            System.out.print(arr2[i]+" ");
        }
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,4,5,6};

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        reverse(arr);
    }
}
