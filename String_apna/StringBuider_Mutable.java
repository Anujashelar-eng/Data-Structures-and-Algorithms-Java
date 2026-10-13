//StringBuilder is Mutable
// toString() method convert object into String
// int a=10;      a.toString() ==> Not Possible a is not object
// Integer a=10;  a.toString() ==> Possible
// Like for ch==> Not Possible But Character Class==> Possible
class StringBuider_Mutable {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder(""); //created Empty String
        for(char ch='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb); //abcdefghijklmnopqrstuvwxyz
        System.out.println(sb.length());
    }
}

// Time Complexity O(26)
//memory Efficient
