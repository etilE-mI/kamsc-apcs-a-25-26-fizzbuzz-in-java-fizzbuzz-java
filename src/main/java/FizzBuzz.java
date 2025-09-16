public class FizzBuzz {
    /**
     * Print the FizzBuzz sequence for 1..100 to standard output.
     * Rules:
     * - Multiples of 3 -> "Fizz"
     * - Multiples of 5 -> "Buzz"
     * - Multiples of both 3 and 5 -> "FizzBuzz"
     * - Otherwise -> the number itself
     * Output should be 100 whitespace-separated tokens (spaces or newlines are fine).
     */
    public static void main(String[] args) {
        //TODO
        for (int i = 1; i <= 100; i++) {
            System.out.print(i + " ");

            if (i % 15 == 0) {
                System.out.println("FizzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fizz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("");
            }
        }
    }
}
