class BubbleSort {
    static void bubbleSort(int arr[]){
        boolean flag=false;
        int count=0;
        for(int i=0;i<arr.length-1;i++){
           
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
                count++;
            } 
            if(flag==false)  {
               break;
            }   
        }
        System.out.println("Count:"+count); 
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        bubbleSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
