// Largest String by =>> lexicographic Order
// BuiltIn=>> str1.compareTo(str2)
//BuiltIN =>> str1.compareToIgnoreCase(str2)

//Q print Largest String

// 0 : equal
// <0 : -ve  str1<str2
// >0 : +ve  str1>str2

// Time Complexity O(X * N)   here compare to function reach to the every character
class LargestString {
    public static void main(String[] args) {
        String Friuts[]={"apple","mango","banana"};

        String largest=Friuts[0];

        for(int i=1;i<Friuts.length;i++){
            if(largest.compareToIgnoreCase(Friuts[i])<0){  //largest jevha small asel tevha inside if
                largest=Friuts[i];
            }
        }
        System.out.println(largest);
    }
}
