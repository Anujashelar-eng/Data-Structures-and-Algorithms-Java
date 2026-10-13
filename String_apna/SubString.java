//substring =>> Consigutive part of string
class SubString {
    static String subString(String str,int start,int end){
        String subString="";
        for(int i=start;i<end;i++){
            subString+=str.charAt(i);
        }
        return subString;
    }
    public static void main(String[] args) {
        String str="HelloWorld";
        int start=0;
        int end=5;
        String sub=subString(str,start,end);
        System.out.println(sub);
    }
}
