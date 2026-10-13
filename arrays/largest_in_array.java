class largest_in_array {
    static void findLargest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String[] args) {
        int arr[]={10,30,40,4,5,89,8};
        findLargest(arr);
    }
}
