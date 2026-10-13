package DSA2;
//count even and odd element in array
class program1 {
    static int[] countevenodd(int arr[]){
        int CountE=0;
        int CountO=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                CountE++;
            }else{
                CountO++;
            }
        }
        return new int[]{CountE,CountO};
    }
    public static void main(String[] args){
        int arr[]={23,4,5,7,8,9,10};


        int result[]=countevenodd(arr);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
