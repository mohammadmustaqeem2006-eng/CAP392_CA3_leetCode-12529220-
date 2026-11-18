class Solution {
    public int countDigitOne(int n) {
        long count = 0;

        for (long place = 1; place <= n; place *= 10) {
            long divider = place * 10;

            long quotient = n / divider;
            long remainder = n % divider;

            count += quotient * place;

            if (remainder >= place) {
                count += Math.min(remainder - place + 1, place);
            }
        }

        return (int) count;
    }
}