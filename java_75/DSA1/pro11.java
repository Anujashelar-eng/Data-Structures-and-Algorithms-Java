package DSA1;
//Strings in Java are immutable, meaning their content cannot be changed after creation.
// When we modify a string, a new object is created and the reference variable is updated 
// to point to the new object.”
class pro11 {
    //StringBuffer str=new StringBuffer("Anuja");
    public static void main(String[] args){
        String str="Anuja Vilas Shelar";
        String[] arr=str.split(" ");

        // for(int i=arr.length-1;i>=0;i--){
        //     System.out.print(arr[i]+" ");
        // }

        String reversed="";
        for(int i=arr.length-1;i>=0;i--){
         reversed=reversed+arr[i]+" ";   
        }

        str=reversed.trim();
        System.out.println(str);
    }
}
