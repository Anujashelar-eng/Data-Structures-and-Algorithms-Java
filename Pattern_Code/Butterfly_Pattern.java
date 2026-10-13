class Butterfly_Pattern {
    public static void main(String[] args) {
        int N = 4;

        // Upper half
        for (int i = 0; i < N; i++) {

            // Left stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < 2 * (N - i - 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = N - 1; i >= 0; i--) {

            // Left stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            // Spaces
            for (int j = 0; j < 2 * (N - i - 1); j++) {
                System.out.print(" ");
            }

            // Right stars
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}

//Loop started by 1
/*class Butterfly_Pattern {
    public static void main(String[] args) {
        int N = 4;

        // Upper half
        for (int i = 1; i <= N; i++) {

            // Left stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces = 2*(N - i)
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // Right stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }

        // Lower half
        for (int i = N; i >= 1; i--) {

            // Left stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            // Spaces = 2*(N - i)
            for (int j = 1; j <= 2 * (N - i); j++) {
                System.out.print(" ");
            }

            // Right stars = i
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
 */