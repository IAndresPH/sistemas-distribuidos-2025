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
        int n = 30; // Cambia este valor según el término que quieras calcular
        long result = fibonacci(n);
        System.out.println("Fibonacci optimizado de " + n + " es: " + result);
    }
}