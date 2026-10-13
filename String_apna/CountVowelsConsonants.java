import java.util.*;
class VowelsAndConsonants{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int Vowels=0;
        int Consonants=0;
        String str=sc.nextLine().toLowerCase();
        System.out.println(str);
        for(char ch:str.toCharArray()){
            if("aeiou".indexOf(ch)!=-1){
                Vowels++;
            }else{
                Consonants++;
            }
        }
        System.out.println("Vowels: "+Vowels);
        System.out.println("Consonant: "+Consonants);
    }


void method2(){
  int vowels = 0, consonants = 0;
  String str="Anuja";
  str=str.toLowerCase();
  for(int i = 0; i < str.length(); i++){
    char ch = str.charAt(i);

    if(Character.isLetter(ch)){   // check if letter

        ch = Character.toLowerCase(ch); // handle uppercase

        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
            vowels++;
        else
            consonants++;
    }
    }
    }
}
