class pairsCondition {
    static void countOfPair(int arr[],int k){
        int count=0;
        int iteration=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                iteration++;
                if (i!=j){
                    if(arr[i]+arr[j]==k){
                         count++;
                    }
                }
            }
        }
        System.out.println(count*2);
        System.out.println(iteration);
    }
    public static void main(String[] args) {
        int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
        int k=10;
        countOfPair(arr,k);
    }
}

// class pairsCondition {
//     static void countOfPair(int arr[],int k){
//         int count=0;
//         for(int i=0;i<arr.length;i++){
//             for(int j=0;j<arr.length;j++){
//                 if(arr[i]+arr[j]==k && i!=j){
//                     count++;
//                 }
//             }
//         }
//         System.out.println(count);
//     }
//     public static void main(String[] args) {
//         int arr[]=new int[]{3,5,2,1,-3,7,8,15,6,13};
//         int k=10;
//         countOfPair(arr,k);
//     }
// }
