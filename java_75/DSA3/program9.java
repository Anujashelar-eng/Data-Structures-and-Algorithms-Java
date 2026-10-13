package DSA3;
// form new array with strings whose starting letter is not vowel
class program9 {

    public static void main(String[] args){

        String arr[][] = {
                {"Apple", "Banana", "Orange"},
                {"Mango", "Umbrella", "Grapes"},
                {"Elephant", "Kiwi", "Cherry"}
        };

        String result[] = new String[9];  // max possible size
        int k = 0;

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){

                char ch = arr[i][j].charAt(0);

                if(!(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U'||
                     ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')){

                    result[k] = arr[i][j];
                    k++;
                }
            }
        }

        System.out.println("Strings not starting with vowel:");
        for(int i = 0; i < k; i++){
            System.out.println(result[i]);
        }
    }
}