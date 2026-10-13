package DSA75;
//Count the pairs with given Sum
class program4{


    static void countPair(int arr[],int k){
        int count=0;

        for(int i=0;i<arr.length;i++){

           for(int j=i+1;j<arr.length;j++){
              if(arr[i]+arr[j]==k && i!=j){
                count++;
              }
           }
        }
        System.out.println(count);
    }
    public static void main(String[] args){
        int N=4;
        int k=6;
        int arr[]=new int[]{1,5,7,1};

        countPair(arr,k);

    }
}