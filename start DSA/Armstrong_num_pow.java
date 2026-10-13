class Armstrong_Number {
    static void isArmstrong(int num) {
        int temp = num;
        int sum = 0;
        int digits = count(num);

        while (num != 0) {
            int lastDigit = num % 10;
            sum += Math.pow(lastDigit, digits);  // Use Math.pow
            num = num / 10;
        }

        System.out.println((sum == temp) ? true : false);
    }

    // Function to count digits
    static int count(int num) {
        int count = 0;
        while (num != 0) {
            count++;
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        isArmstrong(153);  // true
        isArmstrong(9474); // true
        isArmstrong(123);  // false
    }
}
