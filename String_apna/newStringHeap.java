class newStringHeap {
   public static void main(String[] args) {
     String str="Tony";
     for(char ch='a';ch<'z';ch++){
        str=str+ch;   //every time copy and take new memory new object
        System.out.println(str);  //
     }
     System.out.println(str);
   }    
}

//copy time directly proportionl to string length
//loop 26 times copy 26 times so time Complexity is O(N*M) ===> O(N^2)
// so to solve this problem we have StringBuilder
//StringBuilder is mutable 
