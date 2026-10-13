package DSA3;
// iterate over array, count composite numbers and store themA number is composite if:

// ✔ It is greater than 1
// ✔ It has more than 2 factors

// So for each number:

// Count factors

// If factor count > 2 → Composite

class program10 {

    static void composite(int arr[]){
        int arr2[] = new int[arr.length];
        int j = 0;

        for(int i = 0; i < arr.length; i++){

            int num = arr[i];

            if(num <= 1)
                continue;

            int count = 0;

            for(int k = 1; k <= num; k++){
                if(num % k == 0){
                    count++;
                }
            }

            if(count > 2){   // composite condition
                arr2[j] = num;
                j++;
            }
        }

        System.out.println("Composite Numbers:");
        for(int i = 0; i < j; i++){
            System.out.print(arr2[i] + " ");
        }
    }

    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,7,8,9,34,56};
        composite(arr);
    }
}