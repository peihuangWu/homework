public class Fibonacci {
    private static int[] memo = new int[201];

    public static int of(int n) {
        if (n == 1 || n == 2)
            return 1;

        if (memo[n] != 0)
            return memo[n];

        int res = memo[n - 1] + memo[n - 2];
        memo[n] = res;
        return res;
    }
}
