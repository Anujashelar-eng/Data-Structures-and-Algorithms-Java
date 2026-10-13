class Aleast1Larger {
    static void atleast1(int arr[]){
        boolean visited[]=new boolean[arr.length];
       int count=0;

       for(int i=0;i<arr.length;i++){
        if(visited[i]){
            continue;
        }
        for(int j=i+1;j<arr.length;j++){
            if(arr[i]==arr[j]){
                visited[j]=true;
            }
        }
       }
       for(int i=0;i<arr.length;i++){
        if(visited[i]){
            continue;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[i]<arr[j]){
                count++;
                break;
            }
        }
       }
       System.out.println(count);
     
       
        
    }
    public static void main(String[] args) {
        int arr[]={2,5,1,4,8,0,2,8,1,3,9};
        atleast1(arr);
    }
}
