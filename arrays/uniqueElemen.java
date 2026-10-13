class UniqueElement {
    static void atleast1(int arr[]){
        boolean visited[]=new boolean[arr.length];
       int count=0;

       for(int i=0;i<arr.length;i++){
        if(visited[i]){
            continue;
        }else{
        for(int j=i+1;j<arr.length-1;j++){
            if(arr[i]==arr[j]){
                visited[j]=true;
            }
        }
        }
       }
     
        for(int i=0;i<arr.length;i++){
           System.out.print(visited[i]+" ");
           if(!visited[i]){
            count++;
           }
        }
        System.out.println(count);
        
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,4,8,0,2,8,1,3,9};
        atleast1(arr);
    }
}
