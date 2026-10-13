class removeDuplicate2 {
    static void remove(int arr[]){
       // boolean visited[]=new boolean[arr.length];
        for(int i=0;i<arr.length;i++){
            boolean flag=false;
            for(int j=i+1;j<arr.length;j++){
               if(arr[i]==arr[j]){
                flag=true;
                break;
               }
            }
            if(!flag){
                System.out.print(arr[i]+" ");
            }
        }
       
    }
    public static void main(String[] args) {
        int arr[]={2,1,3,4,5,6,6,2,2};
        remove(arr);
    }
}
