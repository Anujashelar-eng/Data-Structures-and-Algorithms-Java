package DSA75;
//Second largest
class program6 {

    static void secondLargest(int arr[]){
        int max=Integer.MIN_VALUE;
        int max2=max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max2=max;
                max=arr[i];
            }

            if(arr[i]>max2 && arr[i]<max){
                max2=arr[i];
            }
        }
        System.out.println(max2);
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,10,45,23,47,90,48};

        secondLargest(arr);
    }
}
