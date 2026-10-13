import java.util.*;
class LCM {
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    
    int i=Math.max(a,b);
    while(true){
        if(i%a==0 && i%b==0){
            
            System.out.println(i);
            break;
        }
        i++;
    }

  }   
}


// int x = a, y = b;

// while(y != 0){
//     int temp = y;
//     y = x % y;
//     x = temp;
// }

// int gcd = x;
// int lcm = (a * b) / gcd;

// System.out.println(lcm);