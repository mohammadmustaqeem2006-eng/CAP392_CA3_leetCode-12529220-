class Solution {
    public double myPow(double x, int n) {

        if (n == 0) return 1.0;
        if (x == 0) {
            return n < 0 ? Double.POSITIVE_INFINITY : 0.0;
        }

        double logValue = Math.log1p(Math.abs(x) - 1.0);

        double ans = Math.exp((double)n * logValue);

        if (x < 0 && (n & 1) != 0) {
            ans = -ans;
        }

        return ans;
    }
}
