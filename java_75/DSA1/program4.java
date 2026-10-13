package DSA1;

//Square root of given number
class program4 {
    public static void main(String[] args){
        int n=4;
        int square=(int) Math.sqrt(n);
        System.out.println(square);
    }    
}



// class Program4 {
//     public static void main(String[] args) {
//         int n = 10;
//         int start = 0;
//         int end = n;
//         int ans = 0;

//         while (start <= end) {
//             int mid = (start + end) / 2;

//             if (mid * mid == n) {
//                 ans = mid;
//                 break;
//             }
//             else if (mid * mid < n) {
//                 ans = mid;   // store possible answer
//                 start = mid + 1;
//             }
//             else {
//                 end = mid - 1;
//             }
//         }

//         System.out.println("Square root (integer part): " + ans);
//     }
// }
