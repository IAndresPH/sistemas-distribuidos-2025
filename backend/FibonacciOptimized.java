public class FibonacciOptimized {

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        long a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static void main(String[] args) {
        System.out.println("=== QA Test: Fibonacci Optimized Implementation ===");

        int n = 30; // Cambia este valor para pruebas
        long result = fibonacci(n);

        System.out.println("Input n: " + n);
        System.out.println("Result: " + result);
        System.out.println("=== End of QA Test ===");
    }
}
