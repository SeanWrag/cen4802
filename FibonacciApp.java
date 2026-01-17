public class FibonacciApp {
    /**
 * Returns the nth term in the Fibonacci sequence using recursion.
 *
 * @param n the term index (0 returns 0, 1 returns 1)
 * @return the Fibonacci value at term n
 */

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static void main(String[] args) {
        int n = 10;
        int result = fib(n);
        System.out.println("The " + n + "th term of the Fibonacci sequence is " + result + ".");
    }
}
