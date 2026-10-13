package DSA2;
//count the number positive negative and zero in array
class program4 {
    static void countPNZ(int arr[]){
        int pos=0;
        int neg=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                pos++;
            }else if(arr[i]<0){
                neg++;
            }else{
               zero++;
            }
        }
        System.out.println(pos);
        System.out.println(neg);
        System.out.println(zero);        
    }
    public static void main(String[] args){
       int arr[]={2,4,5,-1,0,-2};

       countPNZ(arr);
    }
}
