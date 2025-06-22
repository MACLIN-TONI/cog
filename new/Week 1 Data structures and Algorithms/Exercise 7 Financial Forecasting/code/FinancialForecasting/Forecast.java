public class Forecast {
    public double futureValueRecursive(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValueRecursive(principal, rate, years - 1) * (1 + rate);
    }

    public double futureValueMemo(double principal, double rate, int years, Double[] memo) {
        if (years == 0) {
            return principal;
        }
        if (memo[years] != null) {
            return memo[years];
        }
        memo[years] = futureValueMemo(principal, rate, years - 1, memo) * (1 + rate);
        return memo[years];
    }
}
