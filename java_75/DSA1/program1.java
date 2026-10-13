//composite number
package DSA1;

class Program11 {
    public static void main(String[] args) {
        int n = 4;

        if (n <= 1) {
            System.out.println("Neither prime nor composite");
            return;
        }

        boolean isComposite = false;

        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                isComposite = true;
                break;   // stop once divisor found
            }
        }

        System.out.println(isComposite ? "Composite" : "Prime");
    }
}