public class PrimeNumber {
    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 29;
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}
