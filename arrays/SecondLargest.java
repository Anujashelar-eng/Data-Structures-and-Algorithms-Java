class SecondLargest {
    static void secondLargest(int arr[]){
        int Max=Integer.MIN_VALUE;
        int secMax=Max;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>Max){
                secMax=Max;
                Max=arr[i];
            }
        }
        System.out.println(secMax);
    }
    public static void main(String[] args) {
        int arr[]={8,4,5,9,7,8,60};
        secondLargest(arr);
    }
}
