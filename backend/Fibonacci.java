public class Fibonacci {

    public static long fibonacci(int n) {
        if (n <= 1) return n;
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        System.out.println("=== QA Test: Fibonacci Recursive Implementation ===");

        int n = 30; // Cambia este valor para otras pruebas
        long result = fibonacci(n);

        System.out.println("Input n: " + n);
        System.out.println("Result: " + result);
        System.out.println("=== End of QA Test ===");
    }
}
