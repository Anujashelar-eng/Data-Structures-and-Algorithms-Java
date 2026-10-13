package DSA2;
//find the frequency of each element
class program8A {

    static void countF(int arr[]){
        boolean visited[]=new boolean[arr.length];
        int count=0;
        for(int i=0;i<arr.length;i++){
            if(visited[i]==true){
                continue;
            }
            count=1;

            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    visited[j]=true;
                }
            }
            System.out.println(arr[i]+"->"+count);
        }
    }
    public static void main(String args[]){
        int arr[]=new int[]{1,2,3,4,5,5,6,6,6};

        countF(arr);
    }
}
