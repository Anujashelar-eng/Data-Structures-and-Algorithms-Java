package Set_Codes;

class CountDistinctEleBruteForce {
    static int[] countUnique(int arr[]){
        int arr2[]=new int[arr.length];
        boolean flag=true;
        int itr=0;
        for(int i=0;i<arr.length;i++){
            flag=true;
            for(int j=0;j<arr2.length;j++){
               if(arr[i]==arr2[j]){
                   flag=false;
                   break;
               }
            }
            if(flag){
                
                arr2[itr]=arr[i];
                itr++;
            }
        }

        for(int i=0;i<itr;i++){
            System.out.print(arr2[i]+" ");
        }
        return arr2;
    }
    public static void main(String[] args){
        int arr[]=new int[]{1,2,3,3,4,5,4,5,6};

        int arr2[]=countUnique(arr);
        // for(int ele:arr2){
        //     System.out.println(ele+" ");
        // }

        
    }
}
