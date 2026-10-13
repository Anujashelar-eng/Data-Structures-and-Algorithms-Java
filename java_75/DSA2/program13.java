package DSA2;
//count the number of vowels and consonent in the String
class program13 {
    static void count(String str){
        int countVowels=0;
        int countConsonent=0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='A'|| str.charAt(i)=='E'|| str.charAt(i)=='I'||str.charAt(i)=='O'||str.charAt(i)=='U'||
            str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'
            ){
                countVowels++;
            }else{
                countConsonent++;
            }
        }

        System.out.println(countVowels);
        System.out.println(countConsonent);
    }
    public static void main(String[] args){
      String str="Anuja";

      count(str);
    }
}
